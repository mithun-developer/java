package com.learning2;

import java.util.*;

public class MapStrw {
	
	public static void main(String args[]) {
		
		String name="keerthana";
		char[]a=name.toCharArray();
		int size=a.length;
		
		LinkedHashMap<Character,Integer> map= new LinkedHashMap();
		
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
		int maxval=0;
		char maxchar=' ';
		
		for(Map.Entry<Character, Integer> data:sett) {
			
			// Remove duplicate characters 
			
			/*String result="";
			result= result+data.getKey();
			System.out.print(result);
			*/
			
			//***************************************
			
			// print duplicate characters
			
			/*if(data.getValue()>1) {
				System.out.print(data.getKey());
			}*/
			
			
			//********************************************
			
			// Find  maximum occurring character in a String 
			
			if(data.getValue()>maxval) {
				
				maxval=data.getValue();
				maxchar=data.getKey();
			}
			
		}
		
		System.out.print(maxchar+" ");
		System.out.println(maxval);
		
	}

}
