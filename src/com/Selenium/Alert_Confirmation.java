package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Confirmation {
	

	@Test
	public void ExampleForConfirmBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\E_Workspace\\Test_Selenium\\src\\com\\Selenium\\Alert.html");
		
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//System.out.println(alert.getText());
		//alert.dismiss();
		//alert.sendKeys();
	}
}
