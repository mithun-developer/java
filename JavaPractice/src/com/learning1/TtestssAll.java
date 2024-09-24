package com.learning1;
import java.util.*;

public class TtestssAll {
	
	public static void main(String args[]) {
		
		
		String name="maallaaayaaammm";
		name=name.replace(" ", "");
		name=name.toLowerCase();
		
		char[]a=name.toCharArray();
		int size=a.length;
		
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap();
		
		int i=0;
		while(i !=size) {
			if(hm.containsKey(a[i])==false) {
				hm.put(a[i], 1);
			}else {
				int oldval = hm.get(a[i]);
				int newval=oldval+1;
				hm.put(a[i], newval);
			}
			
			i++;
		}
		
		
		int maxval=0;
		String maxkeys="";
		Set<Map.Entry<Character, Integer>> sett = hm.entrySet();
		
		for( Map.Entry<Character, Integer>   data:sett) {
		
			maxkeys=maxkeys+data.getKey();
		
		}
		
		
		System.out.println(maxkeys);
	}

}
