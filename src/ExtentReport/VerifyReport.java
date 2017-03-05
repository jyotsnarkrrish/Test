package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyReport {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;

	@Test
	public void verifyBlogTitle() {
		report = new ExtentReports("E:\\JAR\\extentreports-java-v2.41.0\\ExtendJyot.html");
		logger = report.startTest("Test1:VerifyBlogTitle");
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Browser started");
		driver.get("http://only-testing-blog.blogspot.in");
		logger.log(LogStatus.INFO, "Application up and running");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("ssss"), "Title is not correct");
		logger.log(LogStatus.PASS, "Title verified");
	}

	@AfterMethod
	public void teardown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshot_path = Utility.captureScreenshot(driver, result.getName());
			String image = logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.FAIL, "Title verification", image);
		}
		report.endTest(logger);
		report.flush();
		driver.get("file:///E:/JAR/extentreports-java-v2.41.0/ExtendJyot.html#step-status-filter");
		driver.quit();
	}
}
