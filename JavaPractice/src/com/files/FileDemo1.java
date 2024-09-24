package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileDemo1 {

	public static void main(String[] args) {
		
		File file = new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\Demo1.txt");
		
		try(Reader reader = new FileReader(file);) {
			
			BufferedReader bf = new BufferedReader(reader);
			
			String line = bf.readLine();
			
			while(line!=null) {
				
				System.out.println(line);
				line = bf.readLine();
			}
			
		}catch(IOException e) {
			
		}

	}

}
