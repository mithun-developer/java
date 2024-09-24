package com.learning3;

import java.util.Scanner;

public class Test11 {



	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int i = 0;

		do {
			System.out.println("Enter the number");
			i = sc.nextInt();
		} while (i <= 10);

		System.out.println("Integer greater than 10 detected!");

	}

}
