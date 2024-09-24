package com.filestodelete;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		FileReader fr = new FileReader("C:\\Users\\Mithun\\Desktop\\Collections\\Test.txt");
		
		Scanner sc = new Scanner(fr);
		String st = sc.nextLine();
		System.out.println(st);
	}

}
