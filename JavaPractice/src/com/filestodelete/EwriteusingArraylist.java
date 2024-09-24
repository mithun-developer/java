package com.filestodelete;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EwriteusingArraylist {
	
	public static void main(String args[]) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row ;
		Cell cell;
		
		
		String names[][] = {{"Mithun","DTD","Wellsfargo"},{"Maruthi","DEV","Wellsfargo"}};
		
		int rowcount = names.length;
		int cellcount = names[1].length;
		
		for(int i=0;i<rowcount;i++) {
			row = st.createRow(i);
			for(int j=0;j<cellcount;j++) {
				String str =names[i][j];
				cell = row.createCell(j);
				cell.setCellValue(str);
			}
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo4.xlsx"));
		
	
		wb.write(fo);
		fo.close();
		System.out.println("File created !");
	}

	
	
}

