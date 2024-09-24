package com.filestodelete;

import java.util.Scanner;

public class Swoap {

	
	public static void main(String args[]) {
		System.out.println("please enter 1st number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("please enter 2nd number");
		int b = sc.nextInt();
		
		System.out.println("Actually entered values "+a+" "+b);
		
		a=a+b; //3
		b=a-b;//2
		a=a-b;//1
		
		System.out.println("After swapping valus "+a+" "+b);
		
		
	}
}
