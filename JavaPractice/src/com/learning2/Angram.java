package com.learning2;
import java.util.Arrays;

import java.lang.reflect.Array;



public class Angram {

	
	public static void main(String args[]) {
		String x="silent";
		String y="listen";
	
		char[]a=x.toCharArray();
		char[]b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		boolean res = Arrays.equals(a, b);
		
		if(res==true) {
			System.out.println("Angram");
		}else {
			System.out.println("Not Angram");
		}
     
	}
}
