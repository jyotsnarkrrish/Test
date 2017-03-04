package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selection {
	public void Select() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demos.telerik.com/kendo-ui/dropdownlist/index");
		WebElement element = driver.findElement(By.tagName("select"));
		Select se = new Select(element);
		se.selectByVisibleText("Nov");

		// select.selectByValue("11");
	}

	@Test
	public void openBrowserwithGivenDimension() {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.co.in");
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(420, 600);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
	}
}
