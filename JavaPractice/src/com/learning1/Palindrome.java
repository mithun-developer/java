package com.learning1;

public class Palindrome {

	public static void main(String args[]) {
		
		
		String name = "Malayalam";
		name=name.toLowerCase();
		
		char[] a = name.toCharArray();
		int size = a.length;
		char[] b = new char[size];
		
		int i=0;
		
	while(i !=size) {
		b[size-1-i]=a[i];
		i++;
	}
	
	i=0;
	while(i !=size) {
		if(a[i]!=b[i]) {
			System.out.println("Not a palindrome");
			System.exit(0);
		}else {
			i++;
		}
	}
	
	System.out.println("palindrome");
	}
	
	
}
