package com.filestodelete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Eread {
	
	public static void main(String args[]) throws IOException {
		
		
		FileInputStream file = new FileInputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\New Microsoft Excel Worksheet.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheetAt(0);
		
		
		
		Iterator <Row>itr = st.iterator();
		while(itr.hasNext()) {
			Row r =itr.next();
			Iterator<Cell> it = r.cellIterator();
			while(it.hasNext()) {
				Cell c = it.next();
			System.out.print(c.toString()+" ");
			}
		System.out.println();
		}
		
	}

}
