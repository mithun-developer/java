package com.learning2;

public class VowCou {
	
	public static void main(String args[]) {
		String name="prefer";
		
		name=name.toLowerCase();
		char[]a=name.toCharArray();
		int size=a.length;
		
		int vowels=0;
		int consonants=0;
		int splchar=0;
				
		int i=0;
		while(i !=size) {
			if(a[i]>='a' && a[i]<='z') {
				if(a[i]=='a' || a[i]=='e' || a[i]=='i'|| a[i]=='o'|| a[i]=='u') {
					vowels++;
				}else {
					consonants++;
				}
				
			}else {
				splchar++;
			}
		i++;
		}
		
		System.out.println("Vowels"+":"+vowels);
		System.out.println("consonants"+":"+consonants);
		System.out.println("Special characters"+":"+splchar);
	}

}
