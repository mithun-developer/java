package com.learning;

public class Arrs {
	
	public static void main(String args[]) {
		
		int x[][] = {{100,200,300},{400,500,600},{700,800,900}};
		
		
		for(int i[]:x) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		
		
		
	}

}
