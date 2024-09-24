package com.learning1;

import java.util.*;

public class CheckkkOnlyUniquuesChars {
	
	public static void main(String args[]) {
		
		String name="Mithun";
		char[] a= name.toCharArray();
		int size = a.length;
		
		Map<Character, Integer> map = new HashMap();
		
		int i=0;
		while(i !=size) {
			if(map.containsKey(a[i])==false) {
				map.put(a[i], 1);
			}else {
				int oldval=map.get(a[i]);
				int newval=oldval+1;
				map.put(a[i], newval);
			}
			
			i++;
		}
		
		Set<Map.Entry<Character, Integer>> sett = map.entrySet(); 
		
		for(Map.Entry<Character, Integer>data:sett) {
			if(data.getValue()>1) {
				System.out.println("not unique");
				System.exit(0);
			}
			
		}
		
		System.out.println("Unique");
	}

}
