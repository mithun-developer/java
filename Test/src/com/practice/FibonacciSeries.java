package com.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int a=1, b=1, f = 0;
		
		while(f<100) {
			
			f=a+b;
			System.out.print(f+" ");
			a=b;
			b=f;
		}
		

	}

}
