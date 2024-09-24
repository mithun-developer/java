package com.learning1;
import java.util.*;

public class MapDataStrcture {
	
	public static void main(String args[]) {
		
		String name="Keerthana";
		char[] a= name.toCharArray();
		int size=a.length;
		
	Map<Character, Integer> map = new LinkedHashMap();
	
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
		
	//System.out.println(map);
	Set<Map.Entry<Character, Integer>> sett = map.entrySet();
	for(Map.Entry<Character, Integer> data:sett) {
		System.out.print(data.getKey()+" ");
		System.out.println(data.getValue());
		
	}
	
	}

}
