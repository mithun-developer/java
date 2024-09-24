package com.filestodelete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading_Buffer {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Mithun\\Desktop\\Collections\\Test.txt"));
		String st =bf.readLine();
		System.out.println(st);
		
	}

}
