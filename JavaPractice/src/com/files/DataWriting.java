package com.files;
import java.io.*;

public class DataWriting {
public static void main (String args[]) throws IOException {
	
	
	
	FileWriter fw = new FileWriter("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\Demo1.txt");
	
	fw.write("Mithun - Java Developer");
	fw.close();
}
	
}
