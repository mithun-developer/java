package com.learning1;

public class LenthOfstringss {
	
	public static void main(String args[]) {
		
		String name="Keerthana";
		char[] a = name.toCharArray();
		
		int size = a.length;
		name = name.concat("\0");
		
		int count=0;
		for(int i=0;i<size;i++) {
			if(a[i]!=0) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
