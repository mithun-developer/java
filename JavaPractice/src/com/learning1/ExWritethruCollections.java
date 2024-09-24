package com.learning1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExWritethruCollections {
	
	String name,loc;
	
	ExWritethruCollections(String name,String loc){
		this.name=name;
		this.loc=loc;
		
	}
	
	public static void main(String args[]) throws IOException {
		
		ArrayList<ExWritethruCollections> al = new ArrayList();
		al.add(new ExWritethruCollections("Mithun","Hyd"));
		al.add(new ExWritethruCollections("Keerthana","Blr"));
		al.add(new ExWritethruCollections("Sirisha","Hyd"));
		al.add(new ExWritethruCollections("Sai","Hyd"));
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		int rowcount=0;
		int columncount=0;
		
		for(ExWritethruCollections ec:al) {
			row=st.createRow(rowcount++);
			cell=row.createCell(0);
			cell.setCellValue(ec.name);
			cell=row.createCell(1);
			cell.setCellValue(ec.loc);
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo122.xlsx"));
		wb.write(fo);
		fo.close();
		System.out.println("Done!");
		
	}

}
