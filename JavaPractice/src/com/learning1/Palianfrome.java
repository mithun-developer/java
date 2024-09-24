package com.learning1;

public class Palianfrome {
	
	public static void main(String args[]) {
		
		String name="ReFer";
		name=name.toLowerCase();
		name=name.replace(" ", "");
		char[]a = name.toCharArray();
		int size = a.length;
		char [] b= new char[size];
		
		
		for(int i=0;i<size;i++) {
			b[size-1-i]=a[i];
		}
		for(int i=0;i<size;i++) {
			if(a[i]!=b[i]) {
				System.out.println("Not Palindrome");
				System.exit(0);
			}
		}
		
		System.out.println("Palindrome");
		
	}

}
