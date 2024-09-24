package com.filestodelete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExell {
	
	
	public static void main(String args[]) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mithun\\Desktop\\Collections\\Questions.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheetAt(0);
		Row row;
		Cell cell;
		
		int rowcount = 0;
		int columncount =0;
		
		Iterator <Row>itr = st.iterator();
		while(itr.hasNext()) {
			row = itr.next();
			Iterator<Cell> it = row.cellIterator();
		while(it.hasNext()) {
			cell=it.next();
			System.out.println(cell.toString()+" ");
		}
		
		}
		
		
	}
	
	
   


}
