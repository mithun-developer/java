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

public class RRead {
	
	public static void main(String args[]) throws IOException {
		File f = new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo132.xlsx");
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheetAt(0);
		Row row;
		Cell cell;
		
		Iterator<Row> itr = st.iterator();
		while(itr.hasNext()) {
			row=itr.next();
			Iterator<Cell> it = row.cellIterator();
			while(it.hasNext()) {
				cell=it.next();
			
			System.out.print(cell.toString()+" ");
			}
			System.out.println();
		}
		
		
	}

}
