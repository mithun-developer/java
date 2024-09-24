package com.programmes1;

public class Given_Character_occurrences_without_loop {

	public static void main(String[] args) {
		
		String name="malayalam";
		char c='a';
		
		int count= name.length()-name.replaceAll("a", "").length();
		
		System.out.println(count);

	}

}
