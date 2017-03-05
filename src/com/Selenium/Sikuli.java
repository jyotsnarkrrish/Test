/*package com.Selenium;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.sikuli.script.FindFailed;

import org.sikuli.script.Pattern;

import org.sikuli.script.Screen;

public class Sikuli {

public static void test_sikuli() throws FindFailed, InterruptedException {

// We have to create Screen class object to access method

Screen screen = new Screen();

// Create object of Pattern class and specify the images path


Pattern image1 = new Pattern("E:\\Downloads\\Screen1.PNG");

Pattern image2 = new Pattern("E:\\Downloads\\Screen2.PNG");

Pattern image3 = new Pattern("E:\\Downloads\\Screen3.PNG");

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("https://accounts.google.com/ServiceLogin");


// using screen object we can call type  method which will accept image path and content which //we have to type and will perform action.

// This  will type on username field

screen.type(image1, "jyotsnarkrrish@gmail.com");

//This will type of password field

screen.type(image2, "hahaaha");

// This will click on login button

screen.click(image3);

}

public static void main(String args[]) throws ClassNotFoundException, SQLException, FindFailed, InterruptedException{
	test_sikuli();
	}

}
*/