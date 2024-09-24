package com.filestodelete;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String args[]) throws IOException {
		
		File f = new File("C:\\Users\\Mithun\\Desktop\\Collections\\Test.txt");
		f.createNewFile();
		
	}

}
