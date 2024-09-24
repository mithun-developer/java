package com.programmes1;

import java.util.Arrays;

public class Angram {

	public static void main(String[] args) {
		
		
		String name = "silent";
		String names = "listen";
		
		char a[] = name.toCharArray();
		
		char b[] = names.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		boolean res= Arrays.equals(a, b);
		
		if(res==true) {
			System.out.println("Angram");
		}else {
			System.out.println("Not Angram");
		}

	}

}
