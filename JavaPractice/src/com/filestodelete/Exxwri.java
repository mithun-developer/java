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

public class Exxwri {
	
		
		String name,loc;
		
		Exxwri(String name,String loc){
			this.name=name;
			this.loc=loc;
			
		}
		
		public static void main(String args[]) throws IOException {
			
			ArrayList<Exxwri> al = new ArrayList();
			al.add(new Exxwri("Mithun","Hyd"));
			al.add(new Exxwri("Keerthana","Blr"));
			al.add(new Exxwri("Sirisha","Hyd"));
			al.add(new Exxwri("Sai","Hyd"));
			
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet st = wb.createSheet();
			Row row;
			Cell cell;
			
			int rowcount=0;
			int columncount=0;
			
			for(Exxwri ec:al) {
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



