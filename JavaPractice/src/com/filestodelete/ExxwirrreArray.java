package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExxwirrreArray {
	
	public static void main(String args[]) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		String name[][] = {{"Mithun","Hyd"},{"Keerthana","Hyd"},{"Sirisha","Hyd"}};
		int rowcount = name.length;
		int columncount = name[0].length;
		
		for(int i=0;i<rowcount;i++) {
			row =st.createRow(i);
			for(int j=0;j<columncount;j++) {
				String str = name[i][j];
				cell=row.createCell(j);
				cell.setCellValue(str);
			}
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo132.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("Done!");
	}

}
