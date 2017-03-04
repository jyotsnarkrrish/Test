package com.Selenium;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HandlingSecurityCertificate {

	public class SSLExample_Chrome {

		private WebDriver driver;

		@BeforeClass
		public void setUp() {
			new DesiredCapabilities();
			DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
			desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new ChromeDriver(desiredCapabilities);
			System.setProperty("webdriver.chrome.driver", "E://Downloads//chromedriver.exe");
			driver.manage().window().maximize();
		}

		@Test
		public void openApplication() {
			System.out.println("Navigating application");
			driver.get("https://cacert.org/");
			WebElement headingEle = driver.findElement(By.cssSelector(".story h3"));
			// Validate heading after accepting untrusted connection
			String expectedHeading = "Are you new to CAcert?";
			Assert.assertEquals(headingEle.getText(), expectedHeading);
		}

		@AfterClass
		public void tearDown() {
			if (driver != null)
				driver.quit();
		}
	}
}
