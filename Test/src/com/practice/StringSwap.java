package com.practice;

public class StringSwap {
	
	public static void main(String args[]) {
		
	String a = "Mithun";
	
	String b = "keerthana";
	
	a=a+b;
	
	 b = a.substring(0, a.length()-b.length());
	 
	 a=a.substring(b.length());
		
		
		//System.out.println(b);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
	}

}
