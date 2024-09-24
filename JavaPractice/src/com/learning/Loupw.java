package com.learning;

public class Loupw {

	public static void main(String args[]) {
		
		int num=0; int capacity=10;
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			num=num+i;
			if(num>=capacity) {
				break;
			}
			
		}
	}
	
}
