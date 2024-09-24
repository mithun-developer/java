package com.exceptionhandling;

import java.util.Scanner;

public class Ext extends Exception{
	
	Ext(String str){
		super(str);
	}
	
	public static void main(String args[]) throws Ext {
		System.out.println("Please enter your age");
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		try {
			if(age>18) {
				System.out.println("you are eligible to vote");
			}else {
				throw new Ext("you are not eligible to vote");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
