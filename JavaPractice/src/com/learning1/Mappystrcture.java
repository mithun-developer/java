package com.learning1;
import java.util.*;

public class Mappystrcture {
	
	public static void main(String args[]) {
		String name="kEERTHANA KASYAP";
		/*name=name.replace(" ", "");
		name=name.toLowerCase();*/
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
 	char maxkey=' ';
		for(Map.Entry<Character, Integer> data:sett) {
			//Accessing  Data in MAP Data Structure
			
			/*System.out.print(data.getKey()+" ");
			System.out.println(data.getValue());*/
			
		//**********************************************************
			
			//Check if a String has ALL UNIQUE CHARACTERS 
			
			/*if(data.getValue()>1) {
				System.out.println("Not unique");
				System.exit(0);
			}else {
				i++;
			}
			System.out.println("unique");
			
			*/
			
			//**********************************************************
			
			//print all Non-Repeated Characters in a String
			
			/*if(data.getValue()==1) {
				System.out.println(data.getKey());
			}*/
			
			//**********************************************************
			// Find  maximum occurring character in a String 
				
		if(data.getValue()>maxval) {
			maxval=data.getValue();
			maxkey=data.getKey();
			
			System.out.print(maxval);
			System.out.println(maxkey);
		}
		
		
			//**********************************************************
			
			//print duplicate characters present in a String 
			
		/*	if(data.getValue()>1) {
				System.out.println(data.getKey());
				
			}*/
			
			
			//**********************************************************
			
			//Remove duplicate characters in a String
			
			//System.out.println(data.getKey());
			
			
			//******************************************************
			
			//to count the number of occurrences of each character in a string
			
			//System.out.println(map);
			
			//*******************************************
			
			
		//	to count the total number of occurrences of a given character in a string without using any loop
			
		/*char c='a';
		
		int count= name.length()-name.replace("a","").length();
		System.out.println(count);*/
		
		
		}
		
//		To count the total number of words
		
		/*String ss[] = name.split(" ");
		
		System.out.println(ss.length);
		
		*/
		
		
		}

	
		
	}


