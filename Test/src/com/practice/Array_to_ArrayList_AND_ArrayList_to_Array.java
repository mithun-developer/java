package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_ArrayList_AND_ArrayList_to_Array {
	
	
	public static void main(String args[]) {
		
		
		//Array to ArrayList
		
		String name [] = new String [] {"abc","def","ghi","jkl"};
		
		ArrayList<String> al = new ArrayList(Arrays.asList(name));
		
		System.out.println(al);
		
		
		//ArrayList to Array
		for(String s:al) {
			System.out.println(s);
		}
		
		
	}

}
