package com.filestodelete;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	
	public static void main(String args[]) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\Mithun\\Desktop\\Collections\\Test.txt");
		fw.write("Mithun is learning java");
		fw.close();
	}

}
