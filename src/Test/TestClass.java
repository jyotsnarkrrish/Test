package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E://Installer Softwares//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://only-testing-blog.blogspot.in");
		
		File src= new File("C:\\Users\\jyotsna.r\\Desktop\\eclipse-java-mars-2-win32-x86_64\\newwspa\\test\\TestExcel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//HSSFWorkbook hwb=new HSSFWorkbook(fis);(.xls)
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
				
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data on Excel " +data);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Row count " + rowcount+1);
		
		for(int i=0;i<rowcount;i++){
			String data1 = sheet1.getRow(i).getCell(0).getgetStringCellValue();
			System.out.println("Data on Excel on row "+i+" is " +data1);
		}
		wb.close();//To avoid memory leak
		driver.close();
	}
}
