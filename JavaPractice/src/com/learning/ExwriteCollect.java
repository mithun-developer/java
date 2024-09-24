package com.learning;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExwriteCollect {
	
	protected int num;
	String name;
	ExwriteCollect(int num, String name){
		this.num=num;
		this.name=name;
		
	}

	public static void main(String args[]) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet();
		
		Row row;
		Cell cell;
		
		ArrayList<ExwriteCollect> al = new ArrayList();
		ExwriteCollect ex1 =new ExwriteCollect(1,"Mithun");
		ExwriteCollect ex2 =new ExwriteCollect(2,"Keerthana");
		ExwriteCollect ex3 =new ExwriteCollect(3,"Sirisha");
		
		al.add(ex1);
		al.add(ex2);
		al.add(ex3);
		
		int rowcount=0;
		int columncount=0;
		
		for(ExwriteCollect ex:al) {
			row = st.createRow(rowcount++);
			cell=row.createCell(0);
			cell.setCellValue(ex.num);
			
			cell=row.createCell(1);
			cell.setCellValue(ex.name);
			
			
		}
	
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Mithun\\Desktop\\Collections\\Demo1453.xlsx");
		wb.write(fo);
		fo.close();
		System.out.println("done");
	
	}
	
}
