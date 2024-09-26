package com.practice;

public class PrimeNumbers {

	
	public static void main(String args[]) {
		
	int num =100;
	
	for (int i=1;i<num;i++) {
		boolean isprime= true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isprime=false;
			}
		}
		
		if(isprime) {
			System.out.print(i+" ");
		}
	}
		
		
	}
	
	
}
