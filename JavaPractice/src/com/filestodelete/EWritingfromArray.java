package com.filestodelete;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EWritingfromArray {
	String name,job;
	
	EWritingfromArray(String name,String job){
		this.name=name;
		this.job=job;
		
	}
	
	public static void main(String args[]) throws IOException {
		
		ArrayList<EWritingfromArray> al = new ArrayList();
		
		
		al.add(new EWritingfromArray("Mithun","DTD"));
		al.add(new EWritingfromArray("Keerthana","ADA"));
		
		
	
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		int rowcount = 1;
		//int columncount = 1;
		
		
		for(EWritingfromArray ee:al) {
		row = st.createRow(rowcount++);
		row.createCell(0).setCellValue(ee.name);
		row.createCell(1).setCellValue(ee.job);
		
			
		}
		
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo5.xlsx"));
		wb.write(fo);	
		fo.close();
		System.out.println("yes done");
	}

}
