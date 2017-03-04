package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class toolqa {
	@Test
	private void demo() {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		System.out.println(driver.switchTo().frame("iframe1"));
		driver.findElement(By.name("firstname")).sendKeys("Hello");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("exp-2")).click();
		// Select select = new Select(driver.findElement(By.id("continents")));
		// select.selectByValue("Asia");
		List<WebElement> element = driver.findElements(By.name("profession"));
		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getAttribute("value").equals("Automation Tester")) {
				element.get(i).click();
				System.out.println(element.get(i).isSelected());

			}

		}

	}
}