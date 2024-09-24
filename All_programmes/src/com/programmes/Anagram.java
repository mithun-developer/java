package com.programmes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a="silent";
		String b="listen";
		
		char aa[] =a.toCharArray();
		char bb[] =b.toCharArray();
		
		Arrays.sort(aa);
		Arrays.sort(bb);
		
		boolean res = Arrays.equals(aa, bb);
		
		if(res==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}

}
