package com.learning;

public class Vow {

	public static void main(String args[]) {
		
		int vowels=0,consonents=0;
		
		String name= "Mithun";
		 name = name.toLowerCase();
		
	 for(int i=0;i<name.length();i++) {
		 if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
			 vowels++;
			
		 }else if(name.charAt(i)>='a'&&name.charAt(i)<='z') {
			 consonents++;
			
		 }
	 
		
	 }
	 System.out.println("Vowels: "+vowels);
	 System.out.println("consonents:"+consonents);
	
	}
}
