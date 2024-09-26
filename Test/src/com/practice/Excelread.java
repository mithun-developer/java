package com.practice;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Excelread {

	
	public static void main(String args[]) throws IOException {
		
		File f = new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\JAVA BY KOTHA ABHISHEK\\Collections\\testdata.xlsx");
		FileInputStream file = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheetAt(0);
		
		Iterator <Row>itr = st.iterator();
		while(itr.hasNext()) {
			Row r = itr.next();
			Iterator <Cell>it = r.cellIterator();
			while(it.hasNext()) {
				Cell c = it.next();
				System.out.print(c.toString()+" ");
			}
			System.out.println();
			}
		
		file.close();
		}
	}
	

