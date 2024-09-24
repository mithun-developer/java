package com.exceptionhandling;

public class Throws {
	
	public static void main (String args[]) {
		try {
			Throws.abc();
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
	
	public static void abc() throws ArithmeticException {
		
		int i= 3/0;
		System.out.println(i);
		
	}

	
	
}
 