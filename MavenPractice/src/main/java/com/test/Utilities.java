package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public static WebDriver driver;
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getExcelData() {
		
		ArrayList<Object[]> list = new ArrayList<Object[]>();
		try {
			
			reader  =  new Xls_Reader ("C:\\Users\\Mithun\\eclipse-workspace\\MavenPractice\\TestData\\TestData.xlsx");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		for(int rownum=2;rownum<reader.getRowCount("TestData");rownum++) {
			
			String firstname = reader.getCellData("TestData", "First Name", rownum);
			String lastname = reader.getCellData("TestData", "lastname", rownum);
			String dob = reader.getCellData("TestData", "dob", rownum);
			String noc = reader.getCellData("TestData", "noc", rownum);
			String maidenname = reader.getCellData("TestData", "maidenname", rownum);
			
			Object [] ob =  {firstname,lastname,dob,noc,maidenname};
			list.add(ob);
		}
		
		return list;
	}
	
	
	
	
	
	

}
