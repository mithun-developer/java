package com.learning2;

public class Numswap {
	
	
	public static void main(String args[]) {
		
		int x=44;
		int y=22;
		
		int carry=0;
		int diff=0;
		
		
		while(y!=0) {
			diff=x^y;
			carry=~x&y;
			x=x^y;
			y=carry<<1;
		}
		
	System.out.println(diff);
		
		
		
	}

}
