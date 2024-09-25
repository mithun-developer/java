package com.util;
import java.io.Reader;
import java.util.*;

public class Exam {
	
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getData(){
		
		ArrayList mydata= new ArrayList();
		
		try {
			reader = new Xls_Reader("C:\\Users\\Mithun\\Desktop\\testdata.xlsx");
		}catch(Exception e) {
			
		}
		
		for(int rownum=2;rownum<reader.getRowCount("Sheet1");rownum++) {
			
			String fullname= reader.getCellData("Sheet1", "fullname", rownum);
			String email= reader.getCellData("Sheet1", "email", rownum);
			String currentaddress= reader.getCellData("Sheet1", "currentaddress", rownum);
			String permenantaddress= reader.getCellData("Sheet1", "permenantaddress", rownum);
		
		Object ob[]= {"fullname","email","currentaddress","permenantaddress"};
		mydata.add(ob);
		
		}
		return mydata;
	}
	
	
}
