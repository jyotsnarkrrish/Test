package com.Selenium;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageScroll {

	String URL = "https://en.wikipedia.org/wiki/LinkedIn";

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver.exe");

	}

	//@Test
	private void PagescrollToBottom() {
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	//@Test
	private void PagescrollToElementInPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.linkText("Microblogging"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",element);
		element.click();
		//((JavascriptExecutor) driver).executeScript("document.getElementById('gift-close').onclick());
	}
	
	@Test
	private void PagescrollToCordinatesPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
		//((JavascriptExecutor) driver).executeScript("document.getElementById('gift-close').onclick());
	}
}
