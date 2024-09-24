package com.files;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFilesWriting {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName ="G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\archive.zip";
		
		try (FileOutputStream os = new FileOutputStream(new File(fileName));
		
		ZipOutputStream zip = new ZipOutputStream(os);
		DataOutputStream data = new DataOutputStream(zip);)
	
		{
			ZipEntry dirEntry = new ZipEntry("bin/");
			zip.putNextEntry(dirEntry);
			
			
			ZipEntry binFileEntry = new ZipEntry("bin/ints.bin");
			zip.putNextEntry(binFileEntry);
			
			IntStream.range(0, 1000).forEach(i ->{
				try {
					data.writeInt(i);
				}catch(Exception e) {
					
				}
			});
		
			ZipEntry otherDirEntry = new ZipEntry("text/");
			zip.putNextEntry(otherDirEntry);
			
			
			ZipEntry textFileEntry = new ZipEntry("text/file.txt");
			zip.putNextEntry(textFileEntry);
			
			data.writeUTF("This is text content");
		
		}catch(Exception e) {
			
		}

	}

}
