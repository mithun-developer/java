package com.learning;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExWriteColea {
	
	String name,loc;
	public ExWriteColea(String name, String loc) {
		
		this.name = name;
		this.loc = loc;
	}



	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		Row row;
		Cell cell;
	
		int rowcount = 0;
		int columncount =0;
		
		ArrayList<ExWriteColea> al = new ArrayList();
		
		al.add(new ExWriteColea("Mithun","Hyd"));
		al.add(new ExWriteColea("Keerthana","Hyd"));
		
		for(ExWriteColea ec:al) {
			row=st.createRow(rowcount++);
			cell=row.createCell(0);
			cell.setCellValue(ec.name);
			
			cell=row.createCell(1);
			cell.setCellValue(ec.loc);
			
			
			
		
		}
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Mithun\\Desktop\\Collections\\Demo1353.xlsx");
		wb.write(fo);
		fo.close();
		System.out.println("done");
	}

}
