package com.learning1;

import java.util.*;

public class Maappydatastr {
	
	public static void main(String args[]) {
		
		String name="keerthana";
		char[]a=name.toCharArray();
		int size=a.length;
		
	
		Map <Character,Integer>map = new LinkedHashMap();
		
		int i=0;
		while(i !=size) {
			if(map.containsKey(a[i])==false) {
				map.put(a[i],1);
				
			}else {
				
				int oldval=map.get(a[i]);
				int newval = oldval+1;
				map.put(a[i],newval);
			}
i++;
			}
		
		System.out.println(map);
		
		int maxval=0;
		char maxchar=' ';
		
		Set<Map.Entry<Character,Integer>> sett = map.entrySet();
		
	for(Map.Entry<Character,Integer> abc   :sett) {
			if(abc.getValue()==1) {
				System.out.println(abc.getKey());
				System.exit(0);
			}
			
			
			if(abc.getValue()>maxval) {
				maxval=abc.getValue();
				maxchar=abc.getKey();
			}
			
			
			
		}
		
System.out.println(maxchar);
		
		
		}	
		
		
}
	
	


	


