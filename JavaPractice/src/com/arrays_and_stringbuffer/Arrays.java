package com.arrays_and_stringbuffer;

public class Arrays {
	
	public static void main(String args[]) {
		
		// one way of creating an array and passing values
		int x[]=new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		x[8]=24;
		
		for(int i:x) {
			System.out.println(i);
		}
		
		System.out.println("***********************");
		
		// second way of creating an array and passing values
		
		int y[]= {250,500,750,1000};
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}
		
		
	}

}
