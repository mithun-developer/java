package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExwritethruArr {
	
	String name,team;
	
	ExwritethruArr(String name,String team){
		this.name=name;
		this.team=team;
				
	}
	
	public static void main(String args[]) throws IOException {
		ArrayList<ExwritethruArr> al = new ArrayList();
		
		al.add(new ExwritethruArr("Mithun","DTD"));
		al.add(new ExwritethruArr("Keerthana","ADA"));
		al.add(new ExwritethruArr("Sirisha","ADA"));
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		int rowcount=0;
		int columncount=0;
		
		for(ExwritethruArr ee:al) {
			row = st.createRow(rowcount++);
			row.createCell(0).setCellValue(ee.name);
			row.createCell(1).setCellValue(ee.team);
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo12.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("Done!");
		
	}

}
