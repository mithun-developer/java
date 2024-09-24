package com.files;
import java.io.*;

import java.util.Scanner;

public class DataReader {
	
	public static void main(String args[]) throws IOException {
		
		
		File f =new File("C:\\Users\\Mithun\\Desktop\\Collections\\Demo1.txt");
		
		
		
		Scanner s = new Scanner(f);
		while(s.hasNextLine()) {
		String str=	s.nextLine();
		System.out.println(str);
		}
	
		s.close();
		
		
	}

}
