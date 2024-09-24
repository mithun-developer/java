package com.learning2;

import java.util.*;

import javax.xml.crypto.Data;

public class Maxoccuranceword {
	
	
	public static void main(String args[]) {
		
		String name="keerthana is good keerthana";
		//name=name.replaceAll(" ", "");
		char a[]= name.toCharArray();
		
		int size =a.length;
		
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap();
		
		int i=0;
		
		while(i !=size) {
			if(hm.containsKey(a[i])==false) {
				hm.put(a[i], 1);
			}else {
				int oldval = hm.get(a[i]);
				int newval = oldval+1;
				hm.put(a[i], newval);
				
			}
			i++;
		}
		
		
		Set<Map.Entry<Character, Integer>>sett=hm.entrySet();
		char maxchar=' ';
		int maxval=0;
		
		for(Map.Entry<Character, Integer>   data:sett) {
			/*System.out.print(data.getKey()+" ");
			System.out.println(data.getValue());*/
		
  //****************************************************************
		
		// Check if a String has ALL UNIQUE CHARACTERS
		
		/*if(data.getValue()>1) {
			System.out.println("Not Unique");
			System.exit(0);
		}
		System.out.println("Unique");
		System.exit(0);*/
		
	//*********************************************************		
		// print all Non-Repeated Characters 
		
		/*if(data.getValue()==1) {
			System.out.println(data.getKey());
		}
			*/
			
	//***********************************************************
			//print the First Non-Repeated character 
			
			/*if(data.getValue()==1) {
				System.out.println(data.getKey());
				System.exit(0);
			}
			*/
			
		//***********************************************
			// Find  maximum occurring character in a String 
			
			/*if(data.getValue()>maxval) {
				 
				maxval=data.getValue();
				maxchar=data.getKey();
			}
			
			System.out.println("maximum occurring character in a String is");
			System.out.print(maxval+" ");
			System.out.println(maxchar);
			*/
			
			
			
			//*****************************************
			
			// print duplicate characters 
			
			
			/*if(data.getValue()>1) {
				System.out.println(data.getKey());
			}*/
			
			
			//************************************************
			
			// Remove duplicate characters 
			
			/*String res=" ";
			res=res+data.getKey();
			
			System.out.println(res);*/
			
	//**********************************************************
			
		//	find  duplicate words and their number of occurrences in a string?
			
		if(data.getValue()>1) {
			System.out.print(data.getKey()+" ");
			System.out.println(data.getValue());
		}
			
			
			
			
			
		}	
		
}
}