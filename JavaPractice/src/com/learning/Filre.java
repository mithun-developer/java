package com.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filre {
	public static void main(String args[]) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\Mithun\\Desktop\\Collections\\New Text Document.txt");
		Scanner sc = new Scanner(f);
while(sc.hasNextLine()) {
	System.out.println(sc.nextLine());
}

sc.close();
	}

}
