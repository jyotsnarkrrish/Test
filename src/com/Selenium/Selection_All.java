package com.Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selection_All {
	WebDriver driver = new ChromeDriver();

	@Test
	public void selectSamples() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver.get("http://toolsqa.com/iframe-practice-page/");
		System.out.println(driver.switchTo().frame("iframe1"));
		Select select = new Select(driver.findElement(By.id("continents")));
		select.selectByIndex(2);
	select.selectByVisibleText("Europe");


		// To get all the options present in the dropdown
		List<WebElement> allOptions = select.getOptions();
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
		}

		// To get all the options that are selected in the dropdown.
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println("You have selected: " + webElement.getText());
		}

		// To get the first selected option in the dropdown
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println("The First selected option is::" + firstOption.getText());

		if (select.isMultiple()) {
			System.out.println("Select tag allows multiple selection");
		}
		else{
			System.out.println("Select tag doesn't allows multiple selection");
		}
	}
}