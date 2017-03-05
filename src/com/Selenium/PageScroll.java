package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageScroll {

	String URL = "https://en.wikipedia.org/wiki/LinkedIn";
	WebDriver driver = new ChromeDriver();
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");

	}

	@Test
	private void PagescrollToBottom() {
		driver.get(URL);
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	@Test
	private void PagescrollToElementInPage() throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.linkText("Microsoft"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",element);
		element.click();
		//((JavascriptExecutor) driver).executeScript("document.getElementById('gift-close').onclick());
	}
	
	@Test
	private void PagescrollToCordinatesPage() throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
		//((JavascriptExecutor) driver).executeScript("document.getElementById('gift-close').onclick());
	}
}
