package com.learning;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExWriirte {
public static void main(String[] args) throws IOException {
	XSSFWorkbook wb =new XSSFWorkbook();
	XSSFSheet st = wb.createSheet();
	Row row;
	Cell cell;
	
	String name[][]= {{"Mithun","Hyd"},{"Keerthana","Hyd"}};
	
	int rowcount=name.length;
	int columncount=name[0].length;
	
	for(int i=0;i<rowcount;i++) {
		row=st.createRow(i);
		for(int j=0;j<columncount;j++) {
			String atr=name[i][j];
			cell=row.createCell(j);
			cell.setCellValue(atr);
			
		}
	}
	
	FileOutputStream fo = new FileOutputStream("C:\\Users\\Mithun\\Desktop\\Collections\\Demo1223.xlsx");
	wb.write(fo);
	fo.close();
	System.out.println("done");
	
}
}
