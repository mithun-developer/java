package com.practice;

public class SecondHighestNum {
	
	public static void main(String args[]) {
		
		int num[]={55,23,-5,22,82,34,75,99};
		
		int highest=Integer.MIN_VALUE;
		
		int sechighest=Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>highest) {
				sechighest= 	highest;
				
				highest=num[i];
				
			}
			
			if(num[i]<highest && num[i]>sechighest) {
				sechighest=num[i];
			}
		}
		
		
		
	System.out.println(sechighest);
		
	}
	
	
	
	
}