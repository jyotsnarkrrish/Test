package com.Selenium;
/*
 * Not working
 * 
 */
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileDownloadVerify {
	
		private WebDriver driver;
		
		private static String downloadPath = "E:\\E_Workspace\\Test_Selenium";
		private String URL="http://spreadsheetpage.com/index.php/file/C35/P10/"; 
		
		@BeforeClass
		public void testSetup() throws Exception{
			System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get(URL);
		}
		
		@Test
		public void example_VerifyDownloadWithFileName()  {
			//driver.get(URL);
		    driver.findElement(By.linkText("mailmerge.xls")).click();
		    Assert.assertTrue(isFileDownloaded(downloadPath, "mailmerge.xls"), "Failed to download Expected document");
		}
		
	   //     @Test
		public void example_VerifyDownloadWithFileExtension()  {
			driver.get(URL);
		    driver.findElement(By.linkText("mailmerge.xls")).click();
		    Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".xls"), "Failed to download document which has extension .xls");
		}

	//	@Test
		public void example_VerifyExpectedFileName() {
			driver.get(URL);
		    driver.findElement(By.linkText("mailmerge.xls")).click();
		    File getLatestFile = getLatestFilefromDir(downloadPath);
		    String fileName = getLatestFile.getName();
		    Assert.assertTrue(fileName.equals("mailmerge.xls"), "Downloaded file name is not matching with expected file name");
		}
		

		@AfterClass
		public void tearDown() {
			driver.quit();
		}
		
		/*Verify file downloaded or not*/
		public boolean isFileDownloaded(String downloadPath, String fileName) {
			boolean flag = false;
		    File dir = new File(downloadPath);
		    File[] dir_contents = dir.listFiles();
		  	    
		    for (int i = 0; i < dir_contents.length; i++) {
		        if (dir_contents[i].getName().equals(fileName))
		            return flag=true;
		            }

		    return flag;
		}
		/* Check the file from a specific directory with extension */
		private boolean isFileDownloaded_Ext(String dirPath, String ext){
			boolean flag=false;
		    File dir = new File(dirPath);
		    File[] files = dir.listFiles();
		    if (files == null || files.length == 0) {
		        flag = false;
		    }
		    
		    for (int i = 1; i < files.length; i++) {
		    	if(files[i].getName().contains(ext)) {
		    		flag=true;
		    	}
		    }
		    return flag;
		}
		
		/* Get the latest file from a specific directory*/
		private File getLatestFilefromDir(String dirPath){
		    File dir = new File(dirPath);
		    File[] files = dir.listFiles();
		    if (files == null || files.length == 0) {
		        return null;
		    }
		
		    File lastModifiedFile = files[0];
		    for (int i = 1; i < files.length; i++) {
		       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
		           lastModifiedFile = files[i];
		       }
		    }
		    return lastModifiedFile;
		}
}
