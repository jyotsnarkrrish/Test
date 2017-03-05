package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
/***
 * 
 * @author jyotsna.r
 * 
 * Sleep required while uploading file
 */	
public class RobotClass {
	WebDriver driver = new ChromeDriver();
	@Test
	public void DownloadFile() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");

		// sample url
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		driver.findElement(By.xpath(".//a[@href=contains(text(),'animatedcolors.xls')]")).click();
		Robot robot = new Robot(); // Robot class throws AWT Exception
		Thread.sleep(2000); // Thread.sleep throws InterruptedException
		robot.keyPress(KeyEvent.VK_DOWN); // press arrow down key of keyboard to
											// navigate and select Save radio
											// button

		Thread.sleep(2000); // sleep has only been used to showcase each event
							// separately
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		// press enter key of keyboard to perform above selected action
	}

	@Test
	public static void UploadFile() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://blueimp.github.io/jQuery-File-Upload/basic.html");
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		
		String fileLocation = "Upload";
		String str = System.getProperty("user.dir");
		String replacecode = str.replace("\\", "//");
		String filepath = replacecode.concat("//"+fileLocation);
		
	
		WebDriverWait wait= new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/span")))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("upfile")))).click();
		Thread.sleep(2000);

		    
		String replacecode1 = filepath.replace("//", "\\");
		StringSelection stringSelection = new StringSelection(replacecode1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

			
		Thread.sleep(2000);
	}
}
