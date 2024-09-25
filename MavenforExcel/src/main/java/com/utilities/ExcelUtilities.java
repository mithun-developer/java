package com.utilities;

import java.util.ArrayList;

public class ExcelUtilities {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getExcelData() {
		
		ArrayList<Object[]> mydata = new ArrayList();
		
		try {
			
			reader = new Xls_Reader("C:\\Users\\Mithun\\eclipse-workspace\\MavenforExcel\\src\\main\\java\\com\\testdata\\TestData.xlsx");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for (int rownum=2;rownum<=reader.getRowCount("TestData");rownum++) {
		
			String firstname = reader.getCellData("TestData", "firstname", rownum);
			String lastname = reader.getCellData("TestData", "lastname", rownum);
			String dob = reader.getCellData("TestData", "dob", rownum);
			String noc = reader.getCellData("TestData", "noc", rownum);
			String maidenname = reader.getCellData("TestData", "maidenname", rownum);
			
			Object ob[] = {firstname,lastname,dob,noc,maidenname};
			
		}
		
		return mydata;
		
		
		
	}

}
