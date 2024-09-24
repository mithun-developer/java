package com.learning;

import java.util.Scanner;

public class Swapping2values {
	
	public static void main(String args[]) {
		
		System.out.println("Please enter 1st number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Please enter 2nd number");
		int b= sc.nextInt();
		System.out.println("Before values:"+a+" "+b);
		a=a+b; // 3
		b=a-b; // 2
		a=a-b; // 1
		
		System.out.println("After values:"+a+" "+b);
		
		
		
	}

}
