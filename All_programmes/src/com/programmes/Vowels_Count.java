package com.programmes;

public class Vowels_Count {

	public static void main(String[] args) {
		
		String name = "Mithun learning java";
		name=name.toLowerCase();
		
		int vowels=0;
		int constants=0;
		int splchar=0;
		
		char a[] = name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			if(a[i]>='a' && a[i]<='z') {
				if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ){
					vowels++;
				}else {
					constants++;
				}
			}else {
				splchar++;
			}
		}
		
		System.out.println("vowels:"+ vowels);
		System.out.println("constants:"+ constants);
		System.out.println("splchar:"+ splchar);
	}

}
