package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import utils.ReportManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/test.feature",
        glue = {"src/test/java/stepdefination/StepDefinations.java", "hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        monochrome = true
)
public class TestRunner {

    @AfterClass
    public static void writeExtentReport() {
//        ReportManager.generateExtentReport();
        }
}
