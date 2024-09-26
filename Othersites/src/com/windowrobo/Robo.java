package com.windowrobo;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Robo {
	public static void main(String args[]) throws AWTException, InterruptedException, HeadlessException, UnsupportedFlavorException, IOException, BiffException {
		
		String str = "C:\\Users\\Mithun\\Desktop\\New Text Document (4).txt";
		StringSelection ss = new StringSelection(str);
		Robot r = new Robot();
		Toolkit tl =Toolkit.getDefaultToolkit();
		Clipboard cl= tl.getSystemClipboard();	
		cl.setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(5000);
		
	String sty = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		
		File ff = new File(sty);
		Workbook wb = Workbook.getWorkbook(ff);
		Sheet st = wb.getSheet(0);
		String stg = st.getCell(1, 1).getContents();
		System.out.println(stg);
		
		
		
		
	}


	
	
}
