package com.learning1;

public class Upperrrcasess {
	
	public static void main(String args[]) {
		
		String name="mithun";
		char[] a = name.toCharArray();
		int size=a.length;
		//char[]b = new char[a.length];
		
		int i=0;
		while(i !=size) {
			a[i]=(char) (a[i]-32);
			
			i++;	
		}
		System.out.println(a);
		
	}

}
