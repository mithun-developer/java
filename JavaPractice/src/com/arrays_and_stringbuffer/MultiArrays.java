package com.arrays_and_stringbuffer;

public class MultiArrays {
	
	public static void main(String args[]) {
		
		// one way of creating an multidimensional array and passing values
		
		int x[][] = new int[2][2];
		x[0][0]=50;
		x[0][1]=100;
		x[1][0]=150;
		x[1][1]=200;
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[1].length;j++) {
				System.out.print(x[i][j]+" ");
			}
		System.out.println("");
		
		}
		
		System.out.println("************************");
		// second way of creating an array and passing values
		
		int y[][]= {{100,75,80},{95,98,76},{65,86,97},{100,86,74}};
		for(int i[]:y) {
			for(int j:i) {
				System.out.print(j+" ");
			
			}
		System.out.println(" ");
		
		}
		
		
	}

}
