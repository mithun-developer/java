package com.filestodelete;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelwritecoll {
	
	String name,loc;
	
	Excelwritecoll(String name,String loc){
		this.name=name;
		this.loc=loc;

	}
	
	public static void main(String args[]) throws IOException {
		
		ArrayList<Excelwritecoll> al = new ArrayList();
		
	al.add(new Excelwritecoll("Mithun","Begumpet"));
	al.add(new Excelwritecoll("Keerthana","Uppal"));
	al.add(new Excelwritecoll("Sirisha","Ameerpet"));
	
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		
		int rowcount =0;
		int columncount=0;
		
		
		for(Excelwritecoll ee:al) {
			row = st.createRow(rowcount++);
			cell = row.createCell(0);
			cell.setCellValue(ee.name);
			
			cell = row.createCell(1);
			cell.setCellValue(ee.loc);
		}
		
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo12.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("done");
		
	}

}
