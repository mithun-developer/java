package com.learning;

public class Breeki {
	
	public static void main(String argss[]) {
		
		int sum=0, capacity=10;
		
		for(int i=1;i<capacity;i++) {
			//System.out.println(i);
		
			
			System.out.println(i);
			sum=sum+i;
			if(sum>=capacity) 
				break;
			
			
		}
		System.out.println(sum);
	}

}
