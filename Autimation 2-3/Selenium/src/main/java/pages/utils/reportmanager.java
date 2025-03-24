/*
package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    private static void createInstance() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public static void generateExtentReport() {
        if (extent != null) {
            extent.flush();
        }
    }

    public static ExtentTest createTest(String testName) {
        return getInstance().createTest(testName);
    }
}
*/