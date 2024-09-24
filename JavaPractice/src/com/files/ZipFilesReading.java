package com.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipFilesReading {

	public static void main(String[] args) {
String fileName ="G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\archive.zip";
		
		try (FileInputStream os = new FileInputStream(new File(fileName));
		
		ZipInputStream zip = new ZipInputStream(os);
		DataInputStream data = new DataInputStream(zip);)
	
		{
			ZipEntry dirEntry = zip.getNextEntry();
		
			while(dirEntry !=null) {
				if(dirEntry.isDirectory()) {
					System.out.println("Reading Directory"+" "+dirEntry);
				}else {
					if(dirEntry.getName().endsWith(".bin")) {
						System.out.println("Reading File"+" "+dirEntry);
						List<Integer> list = new ArrayList();
						try {
							while(true) {
								list.add(data.readInt());
							}
						}catch(Exception e) {
							
						}
						System.out.println("list: "+list.size());
						
					}else if(dirEntry.getName().endsWith(".text")) {
						System.out.println("Reading File"+" "+dirEntry);
						String content = data.readUTF();
						System.out.println("content = "+content);
					}
				}
			}
		
		}catch(Exception e) {
			
		}


	}

}
