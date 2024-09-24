package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingDemo extends Exception{
	
	public  ExceptionHandlingDemo(String str){
		super(str);
	}
	

	
	public static void main  (String args[]) throws ExceptionHandlingDemo{
		System.out.println("Enter your age");
		try {
			Scanner sc = new Scanner(System.in);
			
			int	age =sc.nextInt();
			
			if(age<18) {
				throw new ExceptionHandlingDemo ("you are not eligible to vote");
				
			}else {
				System.out.println("you are eligible to vote");
			}
			
			}catch(ExceptionHandlingDemo e) {
				
				  e.printStackTrace();
			}
		
		
	}
}
