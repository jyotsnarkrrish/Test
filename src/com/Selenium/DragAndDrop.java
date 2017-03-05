package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	@Test
	public void DragDrop() {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		try {
			if (source.isDisplayed() && destination.isDisplayed()) {
				Actions action = new Actions(driver);
				action.dragAndDrop(source, destination).build().perform();
				// Verify drop
				String actualText = driver.findElement(By.cssSelector("#droppable>p")).getText();
				Assert.assertEquals(actualText, "Dropped!");
			}

		} catch (Exception e) {
			System.out.println("Error occurred while performing drag and drop operation " + e.getStackTrace());
		}
	}
}
