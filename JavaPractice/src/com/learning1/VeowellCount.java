package com.learning1;

public class VeowellCount {
	
	public static void main(String args[]) {
		String name="Mithun****";
		name= name.toLowerCase();
		
		/*int vowels=0;
		int Consonants=0;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
				vowels++;
			}else if(name.charAt(i)>='a'|| name.charAt(i)<='z')  {
				Consonants++;
			}
		}
		
		
		System.out.println(vowels);
		System.out.println(Consonants);*/
		
		
		
		
		char[] a = name.toCharArray();
		int size = a.length;
		
		int vowels=0;
		int consonants=0;
		int specialCharacters=0;
		
		int i=0;
		while(i !=size) {
			
			if(a[i]=='a'|| a[i]=='e' || a[i]=='i'|| a[i]=='o'|| a[i]=='u'){
				++vowels;
				
					
				}else if(a[i]>='a' && a[i]<='z' || (a[i]>='A' && a[i]<='Z')){
					++consonants;
				}
				
			else {
				++specialCharacters;
			}
			
			
			++i;
		}
		
		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(specialCharacters);
		
	}

}
