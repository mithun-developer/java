package com.arrays_and_stringbuffer;

public class AddingTwoArrays {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90,100};
		
		int sum=0;
		
		for(int i :a) {
		sum=sum+i;
		}
		
		for(int j:b) {
			sum=sum+j;
		}
		
		System.out.println(sum);
	}

}
