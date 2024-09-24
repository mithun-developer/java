package com.filestodelete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class DocuWrite {
	
	public static void main(String args[]) throws IOException {
		
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Mithun\\Desktop\\Collections\\New Microsoft Word Document.docx"));
		
		XWPFDocument doc = new XWPFDocument();
		
		XWPFParagraph p = doc.createParagraph();
		
		XWPFRun run = p.createRun();
		run.setText("Mithun");
		
		doc.write(fo);
		fo.close();
		
		System.out.println("done");
		
		
		
	}

}
