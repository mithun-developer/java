package com.practice;
import java.util.*;

public class Palindrome_string {
	
	public static void main(String args[]) {
	
		String name="race car";
	
		name=	name.replace(" ","");
		name= name.toLowerCase();
		
		char a[] = name.toCharArray();
		int size = a.length;
		
		char b [] = new char[size];
		
		
		int i=0;
		while(i !=size) {
			
			b[size-1-i]=a[i];
			i++;
			
		}
		
		
		i=0;
		while(i !=size) {
			if(b[i]!=a[i]) {
				System.out.println("no");
				System.exit(0);
			}else
				i++;
		}
		
		System.out.println("yes");
		
	}
}
