package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialaizableDemo {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		Employee emp = new Employee("mithun",1);
		
		//Serialization
		try {
			FileOutputStream fo = new FileOutputStream("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\mithun.ser");
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(emp);
			out.close();
			fo.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//De-serialization
		
		FileInputStream fi = new FileInputStream("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\mithun.ser");
		ObjectInputStream in = new ObjectInputStream(fi);
		Employee emp1 = (Employee) in.readObject();
		in.close();
		fi.close();
		System.out.println(emp1.num+" "+emp1.name);
		
	}

}
