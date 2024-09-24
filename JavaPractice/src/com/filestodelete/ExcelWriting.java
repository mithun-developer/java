package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {
	
	public static void main(String args[]) throws IOException {
		
		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		String name[][] = {{"Mithun","DTD"},{"Keerthana","ADA"}};
		
		int rowcount = name.length;
		int cellcount = name[1].length;
		
		for(int i=0;i<rowcount;i++) {
			row = st.createRow(i);
			
			for(int j=0;j<cellcount;j++) {
				String str = name[i][j];
			cell = row.createCell(j);
			cell.setCellValue(str);
			}
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Test.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("File created successfully");
		
	}

}
