package com.programmes;

public class Given_Character_occurrences_without_loop {

	public static void main(String[] args) {
		String name = "mithun learning java";
		
		char c ='a';
		
	int count = name.length()-name.replaceAll("a", "").length();
	System.out.println(count);
		

	}
	
	

}
