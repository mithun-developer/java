package com.filestodelete;

public class Strrev {

	public static void main(String args[]) {
		
		String str = "Mithun";
		
		char[] car = str.toCharArray();
		for(int i=car.length-1;i>=0;i--) {
			System.out.print(car[i]);
		}
		
	}
	
}
