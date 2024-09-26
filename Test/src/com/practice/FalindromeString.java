package com.practice;

import java.util.*;

public class FalindromeString {
	
	public static void main(String args[]) {
		
		String name = "keerthana";
		String names = "tree";
		
		
		
		
		/*char a[] = name.toCharArray();
		int size = a.length;
		char b[] = new char[size];
		
		int i=0;
		
		while(i != size) {
			b[size-1-i]=a[i];
			i++;
		}

		i=0;
		while(i !=size) {
			if(b[i]!=a[i]) {
				System.out.println("Not Palindrome");
				System.exit(0);
			}else {
				i++;
			}
		}
		
		System.out.println("Palindrome");*/
		
		
		
	                    	//String Reverse
		 //****************************************************
		
		
	  /*char a[] = name.toCharArray();
	  int size = a.length;
	  char [] b = new char[size];
	  
	  int i=0;
	  
	  while(i !=size) {
		  b[size-1-i]=a[i];
		  i++;
	  }
	  
	  System.out.println(b);
		*/
		
		
		
		
	                     	//String swapping with out 3rd variable
		 //***************************************************************
		
		/*name=name+names;
		names = name.substring(0, name.length()-names.length());
		
		name = name.substring(names.length());
		
		System.out.println(name);
		
		System.out.println(names);*/
		
		
		
		                 //Palindrome number
		 //***************************************************************
		
	/*	int num=343;
		int sum=0;
		int r;
		int temp;
		
		temp=num;
		
		while(num>0) {
			r=num%10;
			sum =(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome number");
		}else {
			
			System.out.println("Not Palindrome number");
		}*/
		
		
		                  
		//***************************************************************
		
		/*int num=100;
		
		for(int i=1;i<num;i++) {
			boolean isPrime= true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
				isPrime = false;
				}
			}
			
			if(isPrime) {
				System.out.print(i+" ");
			}
		}*/
		
		
		                    //Second Highest Number in an Array
		//***************************************************************
		
	/*	int num[]= {3,-6,99,77,82,42,36,99,23,25};
		
	 int highest = Integer.MIN_VALUE;
	 int sechighest = Integer.MIN_VALUE;
	 
	 
	 for(int i=0;i<num.length;i++) {
		 
		 if(num[i]>highest) {
			 sechighest=highest;
			 
			 highest = num[i];
			 
		 }
		 
		 if(num[i]<highest && num[i]>sechighest) {
			 sechighest = num[i];
		 }
	 }
	 
		System.out.println(sechighest);
		*/
		
		
		
		
		          //Number of occurrences of a given character in a string without loop
		          //***************************************************************
		
	/*char c='m';
	int count = name.length()-name.replaceAll("m", "").length();
	System.out.println(count);
		*/
		
                	//	Number of occurrences of each character in a string
               //***************************************************************
		
		/*char a[] = name.toCharArray();
		int size = a.length;
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap();
		
		int i = 0;
		
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
		     System.out.println(map);
		Set<Map.Entry<Character, Integer>> sett = map.entrySet();
		
		for(Map.Entry<Character, Integer>  data :sett) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
			}
		}
		
		*/
		
		
		                          //Remove whitespaces
       	   	                  //**********************
		
		/*name = name=name.replaceAll("\\s", "");
		
		System.out.println(name);*/
		
		
		                  //Duplicate characters in a string
		                  //********************************
	/*	
		char a[] = name.toCharArray();
		int size = a.length;
		
		LinkedHashMap <Character,Integer>map = new LinkedHashMap();
		
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
		
		Set<Map.Entry<Character, Integer>> sett = map.entrySet();
		
		for(Map.Entry<Character, Integer> data:sett) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
			}
			
		}
		*/
		
		
		
		                 //String Rotation
		            //**********************
		 
		
	/*	String keystr="hunmit";
		String newname=name.concat(name);
		if(newname.contains(keystr)){
		System.out.println("rotational string");
		}else{
		System.out.println("not rotational string");
		}*/
		
		
		                 //Anagram
		                 //*******
		
	/*	char a[] = name.toCharArray();
		char b[] = names.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
	boolean ba = Arrays.equals(a, b);
	
	if(ba==true) {
		System.out.println("Anagram");
	}else {
		System.out.println("No Anagram");
	}
		*/
		
		
		                 //String to Integer
		              //**********************
	
	             //	int i = Integer.parseInt(name);
		
	                       //Integer to String
		                   //**********************
		
		//Integer.toString(i);
		
		
		                     //Remove duplicate characters 
                           //******************************
		
		
		char a[] = name.toCharArray();
		int size = a.length;
		
		LinkedHashMap <Character,Integer>map = new LinkedHashMap();
		
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
		
		Set<Map.Entry<Character, Integer>> sett = map.entrySet();
		
		for(Map.Entry<Character, Integer> data:sett) {
			String res="";
			res=res+data.getKey();
		    System.out.print(res);
			
			
		}
		
		
		
		
		
		
	}

}
