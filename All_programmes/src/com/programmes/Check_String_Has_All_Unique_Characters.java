package com.programmes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Check_String_Has_All_Unique_Characters {

	public static void main(String[] args) {
		
		String name = "mithun learning java";
		
		char[]a = name.toCharArray();
		int size = a.length;
		
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

		Set <Map.Entry<Character,Integer>> sett = map.entrySet();
		
		for(Map.Entry<Character,Integer> data:sett) {
			
			if(data.getValue()>1) {
				System.out.println("String is not Unique");
				System.exit(0);
			}else {
				i++;
			}
		}
		
		System.out.println("String is Unique");
	}

}
