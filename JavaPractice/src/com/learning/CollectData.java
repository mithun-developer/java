package com.learning;
import java.io.File;
import java.io.IOException;

import java.io.FileInputStream;
import java.util.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class CollectData {
	
	public static void main(String args[]) throws IOException, InvalidFormatException{
		
	FileInputStream file = new FileInputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo.xlsx"));
	
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet st = wb.getSheetAt(0);
	
	Iterator<Row> itr = st.iterator();
	while(itr.hasNext()) {
		Row r = itr.next();
		Iterator<Cell> it = r.cellIterator();
		while(it.hasNext()) {
			Cell c = it.next();
			System.out.print(c.toString()+" ");
		}
		System.out.println();		
	}
	file.close();
		
	}

}
