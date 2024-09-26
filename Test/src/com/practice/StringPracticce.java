package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringPracticce {
	
	

	public static void main(String[] args) {
		     //String Reverse - 1st type
		
		//String name = "mithun learning java";
		String name = "THE TUICK BROWN FOX JUMPS OVER LAZY DOG";
		name=name.replace(" ", "");
		//1st way
		//***********
		
		char a[] = name.toCharArray();
		int size = a.length;
		//char b[] = new char[size];
		
		int c[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		LinkedHashMap <Character,Integer>map = new LinkedHashMap();
		
		/*int i=0;
		while(i !=size) {
			b[size-1-i]=a[i];
			i++;
		}
		System.out.println(b);*/
		
		//2nd way
		//**************
		
		/*for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}*/
		
		           //3rd way
				//**************
		
		/*String words[] = name.split(" ");
		String revstring = " ";
		
		for(String w:words) {
			String revword=" ";
			for(int i=w.length()-1;i>=0;i--) {
				revword=revword+w.charAt(i);
			}
			
			revstring=revstring+revword;
		}
		System.out.println(revstring);*/
		
		
		// String swapping with out 3rd variable
		//*****************************************
		
		/*String a = "mithun";
		String b = "modali";
		a=a+b;
		b= a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(b);*/
		
		
		
		 //Number of occurrences of a given character in a string without loop
        //***************************************************************
		
		/*char c='a';
		
		int co = name.length()- name.replaceAll("a", "").length();
		System.out.println(co);*/
		
		
		 //Remove whitespaces
        //**********************
	
	/*String aa =  "mithun           learning java";
	
	aa=aa.replaceAll("\\s", "");
	
	System.out.println(aa);*/
		
		
		

                   //String Rotation
               //**********************
		
		
		/*String aa = "mithun";
		String newstr = aa.concat(aa);
		String keys = "hunmit";
		
		if(newstr.contains(keys)) {
			System.out.println("Rotational String");
		}else {
			System.out.println("Non Rotational String");
		}*/
		
		
		
		//Reverse string preserving spaces
		   //******************************
		
		/*for(int i=0;i<a.length;i++) {
			if(a[i]==' ') {
				b[i]=' ';
			}
			
		}
		
		int j = b.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=' ') {
				if(b[j]==' ') {
					j--;
				}
				
				b[j]=a[i];
				j--;
			}
		}
		System.out.println(b);*/
		
		
		
            		 // Anagram
                   //******************
		
	/*	String x = "silent";
		String y = "listen";
		
		char xx[] = x.toCharArray();
		char yy[] = y.toCharArray();
		
		Arrays.sort(xx);
		Arrays.sort(yy);
		boolean res = Arrays.equals(xx, yy);
		if(res==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}*/
		
		
		

                      //Vowels
             //**********************************
         	/*int vowels=0;
		int constants=0;
		int splchar = 0;
		
		int i=0;
		while(i !=size) {
			if(a[i]>='a' && a[i]<='z') {
				if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u') {
					vowels++;
				}else {
					constants++;
				}
				
			}else {
				splchar++;
			}
			i++;
		}
		
		System.out.println(vowels);
		System.out.println(constants);
		System.out.println(splchar);*/
		
		
		
		
		           //	Number of occurrences of each character in a string
				//***************************************************************
		
		/*int i=0;
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
		System.out.print(map);
		*/
		
		
		 //Duplicate characters in a string
        //********************************

		int i=0;
		while(i !=size) {
			if(map.containsKey(a[i])==false) {
				map.put(a[i], 1);
			}else {
				int oldval = map.get(a[i]);
				int newval =  oldval+1;
				map.put(a[i], newval);
			}
		i++;
		
		}
		
		Set<Map.Entry<Character, Integer>>sett = map.entrySet();
		int maxval=0;
		char maxkey = ' ';
		
		for(Map.Entry<Character, Integer>data:sett) {
			/*if(data.getValue()==1) {
				System.out.print(data.getKey());
			}*/
			
			
		
		
		
		
                   		// String to Integer
                    // **********************
		
		/*String aaa="123";
		
		System.out.println(Integer.parseInt(aaa));*/
		
		
		    // Find  maximum occurring character in a String 
		  // ************************************************
		
		
		/*if(data.getValue()>maxval) {
			maxval=data.getValue();
			maxkey=data.getKey();
			
		}*/
		
		
	}
			
			
		
		
	         	//Check if a String has ALL UNIQUE CHARACTERS 
		   //  ************************************************
		/*
		for(Map.Entry<Character, Integer>data:sett) {
			if(data.getValue()>1) {
				System.out.println("Non unique");
				System.exit(0);
			}else {
				i++;
			}
		}
		System.out.println("Unique");
		*/
		
		
		            //Pangram
	//  ************************************************
		
	
		
		/*i=0;
		
		while(i !=size) {
			int index=a[i]-65;
			c[index]=1;
			i++;
		}
		
		
		i=0;
		while(i !=26) {
			if(c[i]==1) {
				i++;
			}else {
				System.out.println("Not Pangram");
				System.exit(0);
			}
			
			
		}*/
		
		
		
		
		
		System.out.println("Pangram");
		
		
          		// find duplicate elements in an array
		// ************************************************
		
		/*String[] abc = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		
		
		HashSet st = new HashSet();
		
		for(String s:abc) {
			if(!st.add(s)) {
				System.out.println(s);
			}
		}*/
		
		
		
		
	}
	
	
	
}
