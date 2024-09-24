package com.programmes;

public class Palindrome_String {

	public static void main(String[] args) {
		
		
		String name = "malayalam";
		char []a  = name.toCharArray();
		int size = a.length;
		
		char b[] = new char[size];
		
		int i=0;
		
		while(i !=size) {
			b[size-1-i]=a[i];
			i++;
		}
		
		i=0;
		
		while(i !=size) {
			if(b[i]!=a[i]) {
				System.out.println("Not Palindrome");
				System.exit(0);
			}else {
				i++;
			}
			
			
		}
		System.out.println("Palindrome");

	}

}
