package com.files;
import java.io.*;

public class FileDemo {
	
	public static void main(String args[]) throws IOException {
		
		
			File f = new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\abc.txt ");
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.length());
			System.out.println("*********");
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println("**********");
			System.out.println(f.getTotalSpace());
		}else {
			f.createNewFile();
		}
			
			
			
		String str = "mithun";
		Reader reader = new StringReader(str);
		System.out.println(reader.toString());
		
		
		LineNumberReader lf = new LineNumberReader(new FileReader("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\abc.txt"));
		System.out.println(lf.readLine());
		
	/*	bf.skip(6);
		bf.reset();
		bf.mark(readAheadLimit);
		*/
		
		
		
		
		
		
		
	}

}
