package com.learning2;

public class Swappnums {
	
	
	public static void main(String args[]) {
		
		
		
		int a=10;
		int b=6;
		int c = 8;
	/*	System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
	
	/*int temp=a;
	
	 a=b;
	 b=temp;
	
	System.out.println(a);
	System.out.println(b);
	
	*/
	//**************************
	
	/*a=a^b;
	b=a^b;
	a=a^b;*/
	
	
	a=a^b^(b=a);
	b=b^c^(c=b);
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//**************************

		
	/*	a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(a);
		System.out.println(b);*/
	
	}

}
