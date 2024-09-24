package com.learning2;
import java.util.*;

public class MafStructure {
	
	public static void main(String args[]) {
		String name="kEERTHANA KASYAP";
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
		
		
		
		Set<Map.Entry<Character, Integer>> sett = map.entrySet();
		int maxval=0;
		char maxchar=' ';
		
		for( Map.Entry<Character, Integer> data :sett) {
			/*System.out.print(data.getKey()+" ");
			System.out.println(data.getValue());
			*/
			
			
			
			// Find  maximum occurring character in a String 
			
			if(data.getValue()>1) {
				System.out.print(data.getKey()+" ");
				System.out.println(data.getValue());
			}
			
			
			// Check if a String has ALL UNIQUE CHARACTERS
			
			/*if(data.getValue()>1) {
				System.out.println("Not Unique");
				System.exit(0);
			}else {
				i++;
			}
			System.out.println("Unique");*/
			
			
			
		}
		
		
		
		
	}

}
