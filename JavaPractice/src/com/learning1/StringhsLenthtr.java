package com.learning1;

public class StringhsLenthtr {
	
	public static void main(String args[]) {
		
		String name="Mithun";
		
		name=name.concat("\0");
		char[] a = name.toCharArray();
		
		int i=0;
		int count=0;
		
		
		while(a[i]!='\0') {
			count++;
			i++;
		}
		
		System.out.println(count);
	}
	
}