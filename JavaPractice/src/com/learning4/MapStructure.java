package com.learning4;
import java.util.*;

public class MapStructure {
	
	public static void main(String args[]) {
		String name="keerthana";
		
		char a[]=name.toCharArray();
		int size=a.length;
		
	LinkedHashMap<Character,Integer> map = new LinkedHashMap();
		
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
	   System.out.println(map);
	}
	

}
