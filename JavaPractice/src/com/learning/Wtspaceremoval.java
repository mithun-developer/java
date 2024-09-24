package com.learning;

public class Wtspaceremoval {
	
	public static void main(String args[]) {
		String name= "Mithun    ";
		
		
		char[] cha = name.toCharArray();
		
		for(int i=0;i<cha.length;i++) {
			if(cha[i]!=' '&& cha[i]!='\t') {
			System.out.print(cha[i]);	
			}
		}
	}

}
