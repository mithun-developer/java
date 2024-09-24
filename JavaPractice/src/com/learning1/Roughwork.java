package com.learning1;

import java.util.HashMap;

import java.util.*;

public class Roughwork {

	public static void main(String args[]) {
		
		
		// To find the duplicate words and their number of occurrences in a string
		
		String name="Mahesh java is java best language for Mahesh java";
		
		String words[]= name.split(" ");
		int size=words.length;
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap();
		
		
		int i=0;
		while(i !=size) {
			if(map.containsKey(words[i])==false) {
				map.put(words[i], 1);
			
			}else {
				int oldval=map.get(words[i]);
				int newval= oldval+1;
				map.put(words[i], newval);
				
			}
			i++;
		}
		
		Set<Map.Entry<String, Integer>>sett=map.entrySet();
		
		for(Map.Entry<String, Integer> data:sett) {
			if(data.getValue()>1) {
				System.out.print(data.getValue()+" ");
				System.out.println(data.getKey());
			}
			
		
		//**********************************************************
		
		// To count the number of words in a string
			
	//	System.out.println(name.split(" ").length);
			
			
//**************************************************************************
	
		// To count total number of occurrences of a given character in a string without using any loop
		
			/*int num= name.length()-name.replace("e", "").length();
			System.out.println(num);*/
	
			
		
	//*******************************************************************	
		
		 //program to reverse string
		
		
		/*String names="keerthana";
		char a[]=names.toCharArray();
		for( i=names.length()-1;i>=0;i--) {
			System.out.print(a[i]);
		}*/
		
		
		
		
		}
		
		
		//*******************************************************************	
		//To count the number of occurrences of each character in a string
		
		
		/*String names="keerthana is good";
		char a[]=names.toCharArray();
		names=(names.replaceAll("\\s", ""));
		
		int sizes=a.length;
		LinkedHashMap<Character,Integer> maps = new LinkedHashMap();
		 i=0;
		 while(i !=sizes) {
			 if(maps.containsKey(a[i])==false) {
				 maps.put(a[i], 1);
			 }else {
				 int oldval=maps.get(a[i]);
				 int newval=oldval+1;
				 maps.put(a[i], newval);
			 }
			 i++;
		 }
		 
		 Set<Map.Entry<Character, Integer>> setts = maps.entrySet();
		 for(Map.Entry<Character, Integer>data:setts) {
			 
		 }*/
		
		//System.out.println(maps);
		
		//*******************************************************************	
		//To remove all white spaces from a string
		
	//	System.out.println(names.replaceAll("\\s", ""));
		
		//*******************************************************************	
		
		// To find duplicate characters in a string
		
		/*if(data.getValue()>1) {
			System.out.print(data.getKey()+"=");
			System.out.println(data.getValue());
		}
		*/
		
		
		 
		
	}
	
}
