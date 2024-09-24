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

public class Exwritere {
	
	String name,job;
	
	Exwritere(String name,String job){
		this.name=name;
		this.job=job;
	}
	

	public static void main(String args[]) throws IOException {
		HashSet<Exwritere> hs = new HashSet();
		
		hs.add(new Exwritere("Mithun","Java Dev"));
		hs.add(new Exwritere("Siva",".net Dev"));
		hs.add(new Exwritere("Sirisha","ADA"));
		hs.add(new Exwritere("Mithun","Java Dev"));
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		int rowcount=0;
		int columncount=0;
		
		for(Exwritere ee:hs) {
			row = st.createRow(rowcount++);
			row.createCell(0).setCellValue(ee.name);
			row.createCell(1).setCellValue(ee.job);
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo12.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("done");
	}
}
