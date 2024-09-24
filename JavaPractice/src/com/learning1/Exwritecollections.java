package com.learning1;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exwritecollections {
	String name,job,loc;
	Exwritecollections(String name, String job, String loc){
		this.name=name;
		this.job=job;
		this.loc=loc;
	}
	
	public static void main(String args[]) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		
		int rowcount = 0;
		int columncount=0;
				//String name [][] = {{"Mithun","Engineer","Hyderabad"},{"Keerthana","Engineer","Hyderabad"}};
				
				ArrayList<Exwritecollections> al = new ArrayList();	
				
				al.add(new Exwritecollections("Mithun","Engineer","Hyderabad"));
				al.add(new Exwritecollections("Keerthana","Engineer","Hyderabad"));
				
				for(Exwritecollections ec:al) {
					row=st.createRow(rowcount++);
					cell=row.createCell(columncount);
					
					cell.setCellValue(ec.name);
					cell=row.createCell(1);
					cell.setCellValue(ec.job);
					cell=row.createCell(2);
					cell.setCellValue(ec.loc);
				}
				
				
				FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo1422.xlsx"));
				wb.write(fo);
				fo.close();
				System.out.println("Done!");
	}

}
