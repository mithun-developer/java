package com.learning1;

public class AddingArretya {
	
	public static void main(String args[]) {
		
		int num[][] = {{10,20,30},{40,50,60}};
		
		int sum=0;
		
		for(  int[]  a:num) {
			for(int b:a) {
				sum=sum+b;
				
			}
		}
		
		System.out.println(sum);
	}

}
