package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ewritee {
	
	String name,team;
	
	Ewritee(String name,String team){
		this.name=name;
		this.team=team;
	}
	
	
	public static void main(String args[]) throws IOException {
		
		ArrayList<Ewritee> al = new ArrayList();
		
		al.add(new Ewritee("Mithun","DTD"));
		al.add(new Ewritee("Keerthana","ADA"));
		al.add(new Ewritee("Sirisha","ADA"));
		al.add(new Ewritee("Maruthi","DEV"));
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
		
		int rowcount=0;
		int columncount=0;
		
		for(Ewritee ee:al) {
			row = st.createRow(rowcount++);
			row.createCell(0).setCellValue(ee.name);;
			row.createCell(1).setCellValue(ee.team);
			
			//System.out.println(ee.toString()+" ");
		}
		
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo4.xlsx"));
		wb.write(fo);
		fo.close();
		
		System.out.println("done!!");
	}

}
