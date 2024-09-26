package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Transpose1 {
	
	public static void main(String args[]) {
		
		
		String name="mithun^%^dfg*^&dfg^(hdfg&*(&)(*mithuns";
		char a[] = name.toCharArray();
		
		int size = a.length;
		
		String alpha= "";
		String result="";
		LinkedHashMap <Integer,Character> map = new LinkedHashMap();
		for(int i=0;i<a.length;i++) {
			char c=a[i];
			if(Character.isAlphabetic(c)) {
				alpha=alpha+a[i];
			}else {
				map.put(i, c);
			}
		}
		
		System.out.println(map.keySet());
		char b[] = new StringBuilder(alpha).reverse().toString().toCharArray();
		int bind = 0;
		for(int j=0;j<a.length;j++) {
			if(!map.containsKey(j)) {
				result = result+b[bind];
				bind++;
			}else {
				result = result+map.get(j);
			}
					
		}
		
	   System.out.println(name);
		//System.out.println(alpha);
		System.out.println(result);
		
		
		//*******************************************************
		
		
		
		
	}

}


