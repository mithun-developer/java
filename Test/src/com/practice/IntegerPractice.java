package com.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerPractice {

	public static void main(String[] args) {
		
		
		 //Integer to String
        //**********************
		
		/*int m=1;
		Integer.toString(m);*/
		
		
     		 // Palindrome number
		//********************
		
	/*	int num=123;
		int sum=0;
		int r;
		int temp;
		temp=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
			
		}
		
		if(temp==sum) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not palindrome number");
		}
*/
		
		          //Prime Numbers
		  //**********************
		
		/*int num=100;
		for(int i=1;i<num;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			
			
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
		*/
		
		    //Third and Second Highest Number in an Array
		
		 //******************************************
		
		/*int num[]= {3,-6,99,77,82,42,36,99,23,25,98};
		
		int highest=Integer.MIN_VALUE;
		int sechighest=Integer.MIN_VALUE;
		int thhighest=Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>highest) {
				thhighest=sechighest;
				sechighest=highest;
				highest=num[i];
			}else if( num[i]>sechighest) {
				thhighest=sechighest;
				sechighest=num[i];
			}else if(num[i]>thhighest) {
				thhighest=num[i];
			}
		}
		
		System.out.println(sechighest);
		System.out.println(thhighest);
		
		*/
		
		
		             //Triangle
		   //******************************
		
			
			
		 for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		//sum of all digits of a number in java
		 //************************************
		
		
		
		/*  int num = 101; 
		  String x = Integer.toString(num); 
		  int sum=0;
		  for(int i=0;i<x.length();i++) 
		  { sum=sum+Character.getNumericValue(x.charAt(i)); }
		  System.out.println(sum);
		 */
		
	
		         //Matrix Addition In Java
		 //************************************
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter first matrix");
		
		int a [][]= new int [3][5];
		int b [][]= new int [3][5];
		int c [][]= new int [3][5];
		int i,j;
		
		for( i=0;i<3;i++) {
			for( j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter second matrix");
		for( i=0;i<3;i++) {
			for( j=0;j<3;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Addition");
		for( i=0;i<3;i++) {
			for( j=0;j<3;j++) {
				c[i][j]=a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		
         		//Reverse Number
		 //************************************
		
		
			int num=1234;
			int temp;
			int r;
			
			while(num>0) {
				r=num%10;
				
				num=num/10;
				System.out.print(r);
			}
			 
		
		
		       //Armstrong number = 153 and 370 etc...
         		
		       /*
		        *       153 --->  1        5       3
		        *                1*1*1 + 5*5*5 + 3*3*3  = 1+125+27 = 153
		        *       
		        */
		
		 //************************************
		
			
			/* int num=370;
			 int sum=0;
			 int r;
			 int temp;
			 
			 temp=num;
			 
			 while(num>0) {
				 r=num%10;
				 sum=sum+r*r*r;
				 num=num/10;
			 }
			 
			 if(temp==sum) {
				 System.out.println("Armstrong number");
			 }else {
				 System.out.println("Not Armstrong number");
			 }
			 
					 */
					 
		
		
		
		
		 //Print 1 to 100 numbers Without Using any Loop
		//************************************
		
			/*
			 * IntStream.range(1, 101).forEach(a->{ System.out.println(a); });
			 */
			 
			
		
		
	}
	
	
	
	

}
