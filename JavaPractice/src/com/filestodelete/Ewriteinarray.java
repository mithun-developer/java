package com.filestodelete;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ewriteinarray {
	
	public static void main(String args[]) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
				XSSFSheet st = wb.createSheet();
				Row row;
				Cell cell;
				
				String name[][] = {{"Mithun","DTD"},{"Keerthana","ADA"},{"Maruthi","DEV"}};
				
				int rowcount =name.length ;
				int columncount =name[1].length;
				
				CellStyle style = wb.createCellStyle();
				
				for(int i=0;i<rowcount;i++) {
					row = st.createRow(i);
					for(int j=0;j<columncount;j++) {
						String str = name[i][j];
						cell = row.createCell(j);
						cell.setCellValue(str);
						XSSFFont font = wb.createFont();
						font.setBold(true);
						font.setColor(HSSFColor.BLUE.index);
						
						style.setFont(font);
						cell.setCellStyle(style);
						//System.out.println(str.toString()+" ");
						
						
					}
				}
	
	FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo5.xlsx"));
	wb.write(fo);
	fo.close();
	System.out.println("Done!!!");
	
	
	}

}
