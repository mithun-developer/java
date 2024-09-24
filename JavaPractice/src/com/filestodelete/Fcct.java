package com.filestodelete;

import java.util.Scanner;

public class Fcct {
	
	public static void main(String args[]) {
		System.out.println("please enter number");
		
		int fact=1;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
