package com.learning3;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		System.out.println("Please enter a number");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<10) {
			System.out.println("This number is too small");
		}else {
			System.out.println("This number is big enough");
		}
		
	}

}
