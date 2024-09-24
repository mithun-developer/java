package com.learning1;

public class CapitallaSentenceee {
	
	public static void main(String args[]) {
		
		String name="mithun is a java developer";
		char[] a = name.toCharArray();
		int size = a.length;
		
		
		for(int i=0;i<size;i++) {
			if(a[i]!=' ') {
				a[i]=(char)(a[i]-32);
			}
		}
		System.out.println(a);
	}

}
