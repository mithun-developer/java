package com.programmes1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		
		Row row;
		Cell cell;
		
		String name [] [] = {{"Mithun","Hyd"},{"Keerthana","Hyd"}};
		
		int rowcount = name.length;
		int cellcount = name[1].length;
		
		for(int i=0;i<rowcount;i++) {
			row = st.createRow(i);
			
			for(int j=0;j<cellcount;j++) {
				cell=row.createCell(j);
			}
		}

	}

}
