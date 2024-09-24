package com.programmes;

public class Reverse_String_Of_Each_Word {

	public static void main(String[] args) {
		
		
		String name = "mithun learning java";
		
		String words[]= name.split(" ");
		
		String reverseString=" ";
		
		for(String w:words) {
			String reverseWord=" ";
			for(int i=w.length()-1;i>=0;i--) {
				 reverseWord=reverseWord+w.charAt(i);
			}
			
			reverseString=reverseString+reverseWord;
			
		}
		
		System.out.println(reverseString);
		
		
		
		
		
		

	}

}
