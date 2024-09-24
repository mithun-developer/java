package com.filestodelete;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelRep {
	
	static String Effective_Date,Deposit_Name,Deposit_Amount,Confirmation_Number,Deposited_By,Bag_Number,Deposit_Status,
	No_of_Items,Submission_Date_Time,Created_By,Location_ID,Deposit_Account,Location_Name;
	
	ExcelRep(String Effective_Date,String Deposit_Name,String Deposit_Amount,String Confirmation_Number,String Deposited_By,String Bag_Number,
			String Deposit_Status,String No_of_Items,String Submission_Date_Time,String Created_By,String Location_ID,String Deposit_Account,String Location_Name){
		
	this.Effective_Date=Effective_Date;
	this.Deposit_Name=Deposit_Name;
	this.Deposit_Amount=Deposit_Amount;
	this.Confirmation_Number=Confirmation_Number;
	this.Deposited_By=Deposited_By;
	this.Bag_Number=Bag_Number;
	this.Deposit_Status=Deposit_Status;
	this.No_of_Items=No_of_Items;
	this.Submission_Date_Time=Submission_Date_Time;
	this.Created_By=Created_By;
	this.Location_ID=Location_ID;
	this.Deposit_Account=Deposit_Account;
	this.Location_Name=Location_Name;
	
	}
	
public static void main(String args[]) throws IOException {
	
	ArrayList <ExcelRep>al =  new ArrayList();
	
	al.add(new ExcelRep("Effective Date","Deposit Name","Deposit Amount","Confirmation Number",
			"Deposited By","Bag Number","Deposit Status","No.of Items","Submission Date Time",
			"Created By","Location ID","Deposit Account","Location Name"));
	
	al.add(new ExcelRep("08-28-2019","wqa prod support","$0.01","190828290707562","Mithun Modali","","Deposit Complete","1","08-28-2019 00:27:10",
			"Mithun Modali","01","4121080725(121000248-Production Test Account)","SFO"));
	
	XSSFWorkbook wb =new XSSFWorkbook();
	XSSFSheet st = wb.createSheet() ;
	XSSFFont font = wb.createFont();
	XSSFCellStyle style = wb.createCellStyle();
	
	
	
	Row row;
	Cell cell;
	
	int rowcount=0;
	int columncount=0;
	
	for(ExcelRep er:al) {
		row = st.createRow(rowcount++);
		cell = row.createCell(0);
		cell.setCellValue(er.Effective_Date);
		
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		
		
		cell.setCellStyle(style);
		
		cell = row.createCell(1);
		cell.setCellValue(er.Deposit_Name);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(2);
		cell.setCellValue(er.Deposit_Amount);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		
		cell = row.createCell(3);
		cell.setCellValue(er.Confirmation_Number);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(4);
		cell.setCellValue(er.Deposited_By);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(5);
		cell.setCellValue(er.Bag_Number);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(6);
		cell.setCellValue(er.Deposit_Status);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(7);
		cell.setCellValue(er.No_of_Items);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(8);
		cell.setCellValue(er.Submission_Date_Time);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(9);
		cell.setCellValue(er.Created_By);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(10);
		cell.setCellValue(er.Location_ID);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(11);
		cell.setCellValue(er.Deposit_Account);
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
		
		cell = row.createCell(12);
		cell.setCellValue(er.Location_Name);
		
		font.setBold(true);
		font.setColor(HSSFColor.BLUE.index);
		style.setFont(font);
		
		cell.setCellStyle(style);
	}
	
FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\DTDReport.xlsx"));
wb.write(fo);
fo.close();
System.out.println("Done");

}
	
	
	
}
