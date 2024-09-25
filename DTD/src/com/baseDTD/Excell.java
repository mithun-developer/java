package com.baseDTD;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excell {
	
	public static void main(String args[]) throws BiffException, IOException {
		
		String str = "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\allfiles\\Test.xls";
		File ff = new File(str);
		Workbook wb = Workbook.getWorkbook(ff);
			Sheet st =wb.getSheet(0);
			String sro = st.getCell(0, 1).getContents();
			System.out.println(sro);
	}

}
