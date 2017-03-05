package com.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenDimension {

	WebDriver driver = new ChromeDriver();

	@Test
	public void openBrowserwithGivenDimension() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver.navigate().to("http://google.co.in");
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(420, 600);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
	}
}
