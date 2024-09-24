package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritinfroarray {
	String name,team;
	ExcelWritinfroarray (String name,String team){
	this.name=name;
	this.team=team;
	}
	
	public static void main(String args[]) throws IOException {
		ArrayList<ExcelWritinfroarray> al = new ArrayList();
		
		al.add(new ExcelWritinfroarray("Mithun","DTD"));
		al.add(new ExcelWritinfroarray("Keerthana","ADA"));
		al.add(new ExcelWritinfroarray("Sirisha","ADA"));
		al.add(new ExcelWritinfroarray("Siva","Dev"));
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		int rowcount=0;
		int columncount=0;
		
		for(ExcelWritinfroarray ee:al) {
		row=st.createRow(rowcount++);
		row.createCell(0).setCellValue(ee.name);
		row.createCell(1).setCellValue(ee.team);
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo10.xlsx"));
		wb.write(fo);
		fo.close();
		
		System.out.println("done");
	}

}
