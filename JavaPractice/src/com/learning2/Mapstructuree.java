package com.learning2;
import java.util.*;

import org.apache.poi.util.SystemOutLogger;

public class Mapstructuree {
	
	
	public static void main(String args[]) {
		
		
			String name="Keerthana   		is good";
			
			
			name=name.toLowerCase();
			
		 char[]a = name.toCharArray();
		 
		 int size=a.length;
		 LinkedHashMap<Character,Integer> map = new LinkedHashMap();
		 
		 int i=0;
		 while(i !=size) {
			 if(map.containsKey(a[i])==false) {
				 map.put(a[i], 1);
			 }else {
				 int oldval =map.get(a[i]);
				 int newval = oldval+1;
				 map.put(a[i], newval);
			 }
		i++;
		 
		 }
		
		 
		Set<Map.Entry<Character, Integer>> sett = map.entrySet();
		int maxval=0;
		char maxchar=' ';
		for( Map.Entry<Character, Integer> data    :sett) {
			
		// Accessing MAP Data Structure 
			
			/*System.out.print(data.getValue()+" ");
			System.out.println(data.getKey());*/
			
			 //*******************************************************
			
			// Check if a String has ALL UNIQUE CHARACTERS
			
			/*if(data.getValue()>1) {
				System.out.println("Not Unique");
				System.exit(0);
			}else {
				i++;
			}
			System.out.println("Unique");
			*/
			
			
			 //*******************************************************
			
			// print all Non-Repeated Characters 
			
			/*if(data.getValue()==1) {
				System.out.println(data.getKey());
			}*/
			
			
			
			 //*******************************************************
			
			//print the First Non-Repeated character 
			
		/*	if(data.getValue()==1) {
				System.out.println(data.getKey());
				System.exit(0);
			}*/
			
			
			
			//**********************************************************
			// Find  maximum occurring character in a String 
			
			if(data.getValue()>maxval) {
			maxval=	data.getValue();
				maxchar= data.getKey();
			}
			
			System.out.print(maxval+" ");
			System.out.println(maxchar);	
			
			
			
			//**********************************************************
			// print duplicate characters 
			
			/*if(data.getValue()>1) {
				System.out.println(data.getKey());
			}*/
			
			//**********************************************************
			// Remove duplicate characters 
			
			/*String res="";
			res=res+data.getKey();
		    System.out.print(res);
			*/
			//**********************************************************
			
			// Remove all white spaces from a String
			
			/*name=name.replaceAll("\\s", "");
			
			System.out.println(name);*/
			
			
		
			
		}
		
		
			
		}
	
		
	}
	


