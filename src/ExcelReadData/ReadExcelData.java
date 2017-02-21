package ExcelReadData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		ExcelDataConfig excel =new ExcelDataConfig("C:\\Users\\jyotsna.r\\Desktop\\eclipse-java-mars-2-win32-x86_64\\newwspa\\test\\TestExcel.xlsx");
		System.out.println(excel.getData(0, 0, 0));
	}

}
