package com.filestodelete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExRe {
	
	public static void main(String args[]) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Mithun\\Desktop\\Collections\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet st = wb.getSheetAt(0);
		
		Row row;
		Cell cell;
		
		Iterator<Row> itr = st.iterator();
		while(itr.hasNext()) {
			row = itr.next();
			Iterator<Cell> it = row.cellIterator();
			while(it.hasNext()) {
				cell = it.next();
			System.out.println(cell.toString()+" ");	
			}
		}
		
		
		
	}

}
