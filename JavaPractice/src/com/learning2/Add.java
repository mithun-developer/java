package com.learning2;

public class Add {
	
	public static void main(String args[]) {
		
		int num[][]= {{2,3,4},{1,2,3}};
		int sum=0;
		
		for(int i[]:num) {
			for(int j:i) {
				sum=j+sum;
			}
			
		}
		System.out.println(sum);
	}

}
