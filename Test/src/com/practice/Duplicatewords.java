package com.practice;
import java.util.*;

public class Duplicatewords {
	
	
	public static void main(String args[]) {
		
		String name="keeertttthaaana    as";
		
		char[] a = name.toCharArray();
		int size = a.length;
		char [] b = new char[size];
		
		
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap();
		
		int i=0;
		while(i !=size) {
			if(map.containsKey(a[i])==false) {
				map.put(a[i], 1);
			}else {
				
				int oldval = map.get(a[i]);
				int newval = oldval+1;
				map.put(a[i], newval);
			}
			i++;
		}
		
		System.out.println(map);
		
		
		i=0;
		
		while(i !=size) {
			b[size-1-i]=a[i];
			i++;
		}
		System.out.println(b);
	
	Set<Map.Entry<Character, Integer>> sett = map.entrySet();
	for(Map.Entry<Character, Integer> data:sett ) {
		if(data.getValue()>1) {
			System.out.println(data.getValue()+" "+data.getKey());
		}
	}
	
	
	char c = 'a';
	int count = name.length()-name.replaceAll("r", "").length();
	System.out.println(count);

	
	}
	

}
