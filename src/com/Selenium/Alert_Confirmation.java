package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Confirmation {
	WebDriver driver = new ChromeDriver();

	@Test
	public void ExampleForConfirmBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jyotsna.r/Desktop/eclipse-java-mars-2-win32-x86_64/newwspa/test/src/com/Selenium/Alert.html");
		
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//System.out.println(alert.getText());
		//alert.dismiss();
		//alert.sendKeys();
		driver.close();
	}
}
