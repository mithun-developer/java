package com.learning3;

public class Test6 {
public static void main(String args[]) {
		
		String name [][] = {
				{"Mithun","Engineer","Hyderabad"},
				{"Keerthana","Engineer","Hyderabad"}
				};
		
	
		
		for(int row = 0; row < 2; row++) {
			for(int col=0;col<3;col++) {
				String str=name[row][col];
				System.out.print(str);
				System.out.print(" ");
				
			}
			System.out.println();
		}
	
		
		
}
}