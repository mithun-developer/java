package com.learning;

public class Whitespace {
	
	public static void main(String args[]) {
		
		String str = "Mithun  ";
		
		char chars[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if((chars[i]!=' ')&&(chars[i]!='\t')) {
				System.out.print(chars[i]);
			}
		}
		
	}

}
