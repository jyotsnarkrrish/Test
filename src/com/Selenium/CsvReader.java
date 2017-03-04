package com.Selenium;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CsvReader {
@Test
	public static void Csv() throws Exception
	
	{

		@SuppressWarnings("resource")
		CSVReader csvReader = new CSVReader(new FileReader("E:\\E_Workspace\\Test_Selenium\\src\\CSV.csv"));
		List<String[]> li = csvReader.readAll();
		System.out.println(li);
		
		Iterator<String[]> il=li.iterator();
		System.out.println(il);
		while(il.hasNext()){
			String str[]=il.next();
			System.out.println(str);
			for(int i=0;i<str.length;i++)
			{

	System.out.print(" "+str[i]);

			}
		System.out.println("   ");
		}
		
	}

public static void main(String args[]) throws Exception{
	
}
}
