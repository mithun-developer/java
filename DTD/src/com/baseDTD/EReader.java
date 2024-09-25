package com.baseDTD;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class EReader {

	public static void main(String args[]) throws BiffException, IOException {

		String str = "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\allfiles\\Test.xls";
		File test = new File(str);
		Workbook wb = Workbook.getWorkbook(test);
		Sheet sht = wb.getSheet(0);
		String stt = sht.getCell(0, 1).getContents();
		System.out.println(stt);
		
		 
		



	}
}

