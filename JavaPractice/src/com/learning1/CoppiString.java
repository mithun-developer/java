package com.learning1;

public class CoppiString {

	public static void main(String args[]) {
		
		String name="Mithun";
		char[] a= name.toCharArray();
	//	System.out.println(a.length);
		char b[]=new char[8];
		
		int i=0;
		while(i !=a.length) {
		b[i]=a[i];	
			
			i++;
		}
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
