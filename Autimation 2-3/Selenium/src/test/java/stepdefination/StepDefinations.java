package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.utils.DriverFactory.driver;
public class StepDefinations{
@Given("User navigates to the Vodafone e-shop homepage")
public void user_navigates_to_the_vodafone_e_shop_homepage() {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://eshop.vodafone.com.eg/en/");
}
@When("User selects {int} items and adds them to the cart")
public void user_selects_items_and_adds_them_to_the_cart(Integer int1) {
    // Write code here that turns the phrase above into concrete actions

}
@When("User selects an item using the search bar and adds it to the cart")
public void user_selects_an_item_using_the_search_bar_and_adds_it_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions

}
@Then("Items are added to the cart")
public void items_are_added_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions

}
@Then("user don't proceed with the order")
public void user_don_t_proceed_with_the_order() {
    // Write code here that turns the phrase above into concrete actions

}}
/* public class StepDefinitions {

    WebDriver driver;

    @Given("^User navigates to the Vodafone e-shop homepage$")
    public void openHomepage() {

      //  WebDriverManager.chromedriver().setup();
        driver.get("https://eshop.vodafone.com.eg/shop/home");
        driver.manage().window().maximize();
    }

    @When("^User selects 2 items and adds them to the cart$")
    public void selectItems() {
        // Select first item
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement item1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("selector-for-item1")));
        item1.click();

        WebElement addToCart1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("selector-for-add-to-cart")));
        addToCart1.click();

        // Select second item
        WebElement item2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("selector-for-item2")));
        item2.click();

        WebElement addToCart2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("selector-for-add-to-cart")));
        addToCart2.click();
    }

    @When("^User selects an item using the search bar and adds it to the cart$")
    public void selectItemFromSearch() {
        WebElement searchBox = driver.findElement(By.id("search-box"));
        searchBox.sendKeys("Product Name");
        searchBox.submit();

        WebElement item = driver.findElement(By.cssSelector("selector-for-search-item"));
        item.click();

        WebElement addToCart3 = driver.findElement(By.cssSelector("selector-for-add-to-cart"));
        addToCart3.click();
    }

    @Then("^Items are added to the cart$")
    public void verifyItemsInCart() {
        // Optionally, verify if the cart has the correct number of items.
        WebElement cart = driver.findElement(By.cssSelector("selector-for-cart-icon"));
        cart.click();

        WebElement cartItems = driver.findElement(By.cssSelector("selector-for-cart-items"));
        assert(cartItems.getText().contains("3 items"));
    }


    @After
    public void closeBrowser() {
        driver.quit();
    }

    @And("user don't proceed with the order")
    public void userDonTProceedWithTheOrder() {
    }
}
*/