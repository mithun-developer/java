package com.practice;

public class String_Reverse_Preserving_Special_Characters {

	public static void main(String[] args) {
		
		String name="mithun^%*&fgdg^(&dfg*(&)(*mithuns";
		
		System.out.println(name);
		System.out.println(reverse(name));

	}
	
	
	public static String reverse(String name) {
		char [] a = name.toCharArray();
		int size = a.length;
		
		int first =0; int last = a.length-1;
		char temp;
		
		
		
		if(!Character.isAlphabetic(a[first])) {
			first++;
		}if(!Character.isAlphabetic(a[last])) {
			last--;
		}
		
		
		
		if(Character.isAlphabetic(a[first]) && Character.isAlphabetic(a[last])) {
			temp=a[first];
			a[last]=temp;
			first++;
			last--;
		}
		
		return new String(a);
	}

}
