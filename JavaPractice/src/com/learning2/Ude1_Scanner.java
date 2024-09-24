package com.learning2;

import java.util.Scanner;

public class Ude1_Scanner {
	
public static void main(String args[]) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("How Much Milk");
		int i = sc.nextInt();
		System.out.println("How Many Bread");
		int j = sc.nextInt();
		System.out.println("How Many Eggs");
		int k = sc.nextInt();
		
		System.out.println("How Much does one Milk cost");
		Float a = sc.nextFloat();
		
		System.out.println("How Much does one Bread cost");
		Float b = sc.nextFloat();
		System.out.println("How Much does one Egg cost");
		Float c = sc.nextFloat();
		
		Float bill = i*a+j*b+k*c;
		
		System.out.println("your total cost is"+" "+bill);
}

}
