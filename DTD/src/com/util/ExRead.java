package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExRead {
	
	
	public static void main(String args[]) throws IOException {
		
		File f = new File("C:\\Users\\Mithun\\Desktop\\testdata.xlsx");
		
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheetAt(0);
		
		
		
		
		Iterator<Row> itr = st.iterator();
		while(itr.hasNext()) {
			Row r =itr.next();
			Iterator<Cell> it = r.cellIterator();
			while(it.hasNext()) {
				Cell c=it.next();
				System.out.print(c.toString()+" ");
			}
			System.out.println();
		}
		file.close();
	}

}
