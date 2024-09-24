package com.filestodelete;

public class Primme {
	
public static void main(String args[]) {
	
	int max =500;
	
	for(int i=1;i<500;i++) {
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
