package com.learning1;

public class ReevvertseNmee {
	
	public static void main(String args[]) {
		String name="Kerrthana";
		
		char[]a = name.toCharArray();
		int size = a.length;
		
		char[] b = new char[size];
		
		for(int i=0;i<size;i++) {
			b[size-1-i]=a[i];
			
		}
	
	System.out.print(b);
	}
	

}
