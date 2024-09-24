package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrittte {

	public static void main(String args[]) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFCellStyle style = wb.createCellStyle();
		XSSFFont font = wb.createFont();
		XSSFSheet st = wb.createSheet();
		
		Row row;
		Cell cell;
		
		
		
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		
		String name[][] = {{"Mithun","DTD"},{"Keerthana","ADA"},{"Sirisha","ADA"},{"Sai","ADA"}};
		
		int rowcount=name.length;
		int columncount = name[2].length;
		
		for(int i=0;i<rowcount;i++) {
			row = st.createRow(i);
			
			
			for(int j=0;j<columncount;j++) {
				String str = name[i][j];
				cell = row.createCell(j);
				cell.setCellValue(str);
				
			cell.setCellStyle(style);
				
				
			}
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo6.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("File Created!!!");
		
	}
	
	
}
