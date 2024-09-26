package com.practice;

public class Twobit {
	
	public static void main(String args[]) {
		
		//two bit manipulation
		
		String input = "mithun";
		//input = input.replaceAll(" ", "");
		//input = input.toUpperCase();
		
		char[] a= input.toCharArray();
		
		int val =2;
		char first ='a';
		char alpha=' ';
		int size = 26;
		String abc=" ";
		
		//Output: cefg
		//Output: mithun - okvjwp
		
		for(int i=0;i<input.length();i++) {
			 alpha = input.charAt(i);
			  
			
		
			abc = abc+input.replace(alpha, (char) (((alpha-first+val)%size)+first));

			
		}
	
		System.out.print(abc);
		
	}
	

}
