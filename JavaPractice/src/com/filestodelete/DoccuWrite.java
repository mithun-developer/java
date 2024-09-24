package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class DoccuWrite {
	
	public static void main(String args[]) throws IOException {
		
		XWPFDocument doc = new XWPFDocument();
		XWPFParagraph pr = doc.createParagraph();
		XWPFRun r = pr.createRun();
		
		r.setText("Mithun");
		
		FileOutputStream file = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\New Microsoft Word Document.docx"));
		doc.write(file);
		file.close();
		
		System.out.println("Completed");
	}

}
