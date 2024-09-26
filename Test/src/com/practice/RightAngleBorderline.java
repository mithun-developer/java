package com.practice;

import java.util.Scanner;

public class RightAngleBorderline {

	public static void main(String[] args) {
		
	/*	for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				if(j==0 || j==i-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int k=0;k<10;k++) {
			System.out.print("*");
		}
		
		*/
		
		
		
		//matrix Addition
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first matrix");
		
		int a[][] = new int[2] [2];
		int b[][] = new int[3] [3];
		int c[][] = new int[4] [4];
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter second matrix");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Addition of 2 matrix");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]= a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		}

	}


