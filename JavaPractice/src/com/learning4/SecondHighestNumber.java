package com.learning4;

public class SecondHighestNumber {
	
	public static void main(String args[]) {
		
		int num[]= {3,-6,99,77,82,42,36,99,23,25};
		
		int highest=Integer.MIN_VALUE;
		
		int secondhighest=Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>highest) {
				
				secondhighest=highest;
				highest=num[i];
			}
			
			if(num[i]<highest && num[i]>secondhighest) {
				secondhighest=num[i];
			}
		}
		
		System.out.println(secondhighest);
		
		
	}
				

}
	

