package com.learning4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String args[]) throws IOException {
		
		File f = new File("C:\\Users\\Mithun\\Desktop\\New Text Document (3).txt");
		Scanner s = new Scanner(f);
		while(s.hasNext()) {
			String str=s.next();
			System.out.println(str);
		}
		
		/*BufferedReader bf = new BufferedReader(new FileReader(f));
		String str=bf.readLine();
		System.out.println(str);
		*/
	}

}
