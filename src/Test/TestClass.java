package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://Installer Softwares//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in");
	}
}
