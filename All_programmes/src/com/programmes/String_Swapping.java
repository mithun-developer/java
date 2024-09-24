package com.programmes;

public class String_Swapping {

	public static void main(String[] args) {
		
		String a = "mithun";
		String b="modali";
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		

		
	
		
		
	}

}
