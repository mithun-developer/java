package com.programmes;

public class Prime_Numbers {

	public static void main(String[] args) {
		
		int num=100;
		
		for(int i=1;i<num;i++) {
			boolean isPrime = true;
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
