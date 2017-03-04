/*package com.Selenium;

import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;


public class AdvanceReporting {

	public static void main(String args[]) throws Exception

	{
		verifySeleniumBlog();
	}

@Test
public static void verifySeleniumBlog(){



 ExtentReports extent = ExtentReports.(AdvanceReporting.class);






 extent.init("C:\\Mukesh\\Report\\myreport.html", true);



// Start Test

extent.startTest("Verify Page Title");





 // Start browser

 WebDriver driver=new FirefoxDriver();
 driver.manage().window().maximize();
 extent.log(LogStatus.INFO, "Browser started");



	           // Open application

	           driver.get("http://learn-automation.com");

	           extent.log(LogStatus.INFO, "Navigated to www.learn-automation.com");



	           // get title

	           String title=driver.getTitle();

	           extent.log(LogStatus.INFO, "Get the current title");



	           // Verify title

	            Assert.assertTrue(title.contains("Selenium"));

	            extent.log(LogStatus.PASS, "Title verified");



// In case you want to attach screenshot then use below method

// I am taking random image but you have to take screenshot at run time and specify the path

extent.attachScreenshot("C:\\Mukesh\\image1.jpg");



// Close application

driver.quit();

extent.log(LogStatus.INFO, "Browser closed");


// close report

extent.endTest();



	     }

}
*/