package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class HomePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By productList = By.cssSelector(".product-card");
    private final By addToCartButton = By.cssSelector("button.add-to-cart");
    private final By searchBox = By.cssSelector("input[placeholder='Search']");
    private final By searchButton = By.cssSelector("button.search-button");
    private final By cartItemCount = By.cssSelector(".cart-items-count");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addFirstTwoItemsToCart() {
        List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productList));
        for (int i = 0; i < 2; i++) {
            products.get(i).findElement(addToCartButton).click();
        }
    }

    public void searchAndAddItem(String productName) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.clear();
        searchInput.sendKeys(productName);
        driver.findElement(searchButton).click();

        List<WebElement> searchResults = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productList));
        if (!searchResults.isEmpty()) {
            searchResults.get(0).findElement(addToCartButton).click();
        }
    }

    public void verifyItemsInCart(int expectedCount) {
        int actualCount = Integer.parseInt(driver.findElement(cartItemCount).getText());
        if (actualCount == expectedCount) {
            System.out.println("Cart contains the correct number of items: " + actualCount);
        } else {
            throw new AssertionError("Expected " + expectedCount + " items, but found " + actualCount);
        }
    }
}
