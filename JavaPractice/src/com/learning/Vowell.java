package com.learning;

public class Vowell {
	
	static String name="Mithun";
	
	
	public static void main(String args[]) {
		int vowels=0, consonants=0;
		name = name.toLowerCase();
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				vowels++;
			}else if (name.charAt(i)>'a'||name.charAt(i)<'z') {
				consonants++;
			}
			
			
		}
		
		System.out.println("vowels:"+vowels);
		System.out.println("consonants:"+consonants);
	}
	
}
