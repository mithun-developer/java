package com.learning1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritteew {
	
	public static void main(String args[]) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		
		Row row;
		Cell cell;
		
		String name [][] = {{"Mithun","Engineer","Hyderabad"},{"Keerthana","Engineer","Hyderabad"}};
		
		int rowcount = name.length;
		int columncount=name[0].length;
		
		for(int i=0;i<rowcount;i++) {
			row=st.createRow(i);
			for(int j=0;j<columncount;j++) {
				
				String str=name[i][j];
			cell=row.createCell(j);
				cell.setCellValue(str);
				
			}
		}
		
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Mithun\\Desktop\\Collections\\Demo1473.xlsx");
		wb.write(fo);
		fo.close();
		System.out.println("done");
	
		
	}

}
