package ExtentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String captureScreenshot(WebDriver driver, String screenshotName) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			System.out.println(driver+">>>>>>>>>"+ts);
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = "C:\\Users\\jyotsna.r\\Desktop\\eclipse-java-mars-2-win32-x86_64\\newwspa\\test\\" + screenshotName + ".jpg";

			File destination = new File(dest);

			FileUtils.copyFile(source, destination);

			System.out.println("Screenshot taken");
			return dest;
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
