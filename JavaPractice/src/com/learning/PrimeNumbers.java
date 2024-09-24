package com.learning;

import java.util.Scanner;

public class PrimeNumbers {

	
	public static void main(String args[]) {
	
		int max=100;
		
		for(int i=1;i<max;i++) {
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
	
	
	
	}
}
