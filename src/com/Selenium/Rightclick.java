package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Rightclick {
WebDriver driver;
	
	String URL = "http://medialize.github.io/jQuery-contextMenu/demo.html";
	
	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void rightClickTest() {
		driver.navigate().to(URL);
		WebElement element=driver.findElement(By.cssSelector(".context-menu-one.btn"));
		Actions action =new Actions(driver).contextClick(element);
		action.build().perform();
		
	
	}
}
