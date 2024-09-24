package com.learning1;

public class CopySanmeename {
	
	public static void main(String args[]) {
		
		String name="Keerthana";
		char[]a = name.toCharArray();
		int size = a.length;
		char [] b = new char[size];
		
		for(int i=0;i<size;i++) {
			b[i] = a[i];
		}
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
