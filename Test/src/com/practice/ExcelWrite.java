package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String args[]) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		
		
		String name[] [] = {{"Mithun","Java","Hyd"},{"Keerthana","ADA","Hyd"}};
		
		int rowCount = name.length;
		int cellCount = name[1].length;
		
		
		for(int i=0;i<rowCount;i++) {
			row = st.createRow(i);
			for(int j=0;j<cellCount;j++) {
				String data = name[i][j];
				cell = row.createCell(j);
				cell.setCellValue(data);
				
			}
		}
		
		FileOutputStream fo = new FileOutputStream(new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\Demo3.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("done");
	}

}
