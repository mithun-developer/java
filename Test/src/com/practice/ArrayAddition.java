package com.practice;

public class ArrayAddition {

	
	public static void main(String args[]) {
		int x[]= {1,2,3};
		int y[]= {1,2,3};
		
		int z = 0;
		
		for(int sum:x){
			
			z=z+sum;
			
		}
		
		System.out.println(z);
	}
}
