package com.learning1;

import java.util.*;

public class Revvers {
	
	public static void main(String args[]) {
		
		String name="too hot to have coffee";
		
		
		char []a = name.toCharArray();
		int size= a.length;
		
		char key='t';
		String str ="";
	
	LinkedHashMap<Character,Integer> map = new LinkedHashMap();	
	
		int i=0; 
		
		while(i !=size) {
		
			if(a[i]!=key) {
				str=str+a[i];
			}
			i++;
		}
		
		System.out.println(str);
			
			
		}
		

		
		
	
			
	}

