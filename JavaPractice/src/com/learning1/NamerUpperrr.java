package com.learning1;

public class NamerUpperrr {
	public static void main(String args[]) {
		
		String name ="keerthana";
		
		char[]a = name.toCharArray();
		int size = a.length;
		char[]b = new char[size];
		
		for(int i=0;i<size;i++) {
			b[i]=(char) (a[i]-32);
		}
		
		System.out.println(b);
	
	}

}
