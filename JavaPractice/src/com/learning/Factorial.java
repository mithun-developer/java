package com.learning;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		
		System.out.println("please enter number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		long fact =1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		
		System.out.println(fact);
	}
}
