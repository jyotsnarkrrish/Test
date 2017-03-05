package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Frames {

	private WebDriver driver = new ChromeDriver();

	@Test
	public void switchToFrameByIndex(int frame) {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		try {
			driver.switchTo().frame(frame);
			System.out.println("Navigated to frame with id " + frame);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id " + frame + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with id " + frame + e.getStackTrace());
		}
	}

	@Test
	public void switchToFrameByID() {
		try {
			driver.switchTo().frame("IF1");
			System.out.println("Navigated to frame with name " + "IF1");
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id " + "IF1");
			System.out.println("Unable to navigate to frame with id " + "IF1" + e.getStackTrace());
		}
	}

	@Test
	public void switchToFrameByElement(WebElement frameElement) {
		try {
			driver.get("http://toolsqa.com/iframe-practice-page/");
			if (frameElement.isDisplayed()) {
				driver.switchTo().frame(frameElement);
				System.out.println("Navigated to frame with element " + frameElement);
			} else {
				System.out.println("Unable to navigate to frame with element " + frameElement);
			}
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with element " + frameElement + e.getStackTrace());
		} catch (StaleElementReferenceException e) {
			System.out.println(
					"Element with " + frameElement + " is not attached to the page document" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with element " + frameElement + e.getStackTrace());
		}
	}

	@Test
	public void Frame() {
		// WebDriver element= driver.findElement(By.xpath"");
		driver.get("http://toolsqa.com/iframe-practice-page/");
		WebDriver driver1 = driver.switchTo().frame(0);
		// driver.switchTo().frame(ParentFrame).switchTo().frame(ChildFrame);
		driver.switchTo().defaultContent();
		System.out.println(driver1);
		System.out.println(driver.switchTo().frame("0"));
		System.out.println(driver.switchTo().parentFrame());
		System.out.println(driver.switchTo().frame(driver.findElement(By.id("IF1"))));

		// As there is frame, we have to navigate to frame
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
