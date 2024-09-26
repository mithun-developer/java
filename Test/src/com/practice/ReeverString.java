package com.practice;

import java.util.Arrays;
import java.util.*;

public class ReeverString {
	
	public static void main(String srgs[]) {
		
		String name="mithun learning java";
	//	name=name.replace(" ", "");
		
		char []a = name.toCharArray();
		int size = a.length;
		char [] b= new char [size];
		
		LinkedHashMap <Character,Integer>map = new LinkedHashMap();
		 //String Reverse Preserving Spaces
		//***************************************************
		
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
		
		
	        //	String Reverse each word
		//***************************************************
		
		/*String words[] = name.split(" ");
		String reverseString = " ";
		
		for(String w:words) {
			String reverseWord = " ";
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseWord=reverseWord+w.charAt(i);
			}
			
			reverseString=reverseString+reverseWord;
		}
		
		System.out.println(reverseString);
		
		*/
		
		
		
		             // Palindrome Number
		//***************************************************
		
		
	/*	int num = 1241;
		
		int sum=0;
		int temp;
		int r;
		
		temp=num;
		
		while(num>0) {
			r= num%10;
			sum= (sum*10)+r;
			num= num/10;
			
			
		}
		
		if(temp==sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}*/
		
		
		
		  //Number of occurrences of a given character in a string without loop
          //***************************************************************
		
		
		/*char c = 'a';
	
		
	 int count = name.length()-name.replaceAll("a", "").length();
	 System.out.println(count);
		
		*/
		
		
		                      //anagram 
		  //***************************************************************	
		
	/*	String x = "silent";
		String y = "listen";
		char[] xx = x.toCharArray();
		char[] yy = y.toCharArray();
		
		Arrays.sort(xx);
		Arrays.sort(yy);
		boolean res = Arrays.equals(xx, yy);
		
		if(res==true) {
			System.out.println("anagram");
		}else {
			System.out.println("Non anagram");
		}*/
		

		
                		 // prime numbers 
               // ***************************************************************
	
	/*	int num=100;
		for(int i=1;i<num;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			
			if(isPrime) {
				System.out.print(i+" ");
			}
		}*/
		
		
		
                   //Second Highest Number in an Array
		  // ***************************************************************
		
		       /* int num[]= {3,-6,99,77,82,42,36,99,23,25,98};
		
		
		int highest = Integer.MIN_VALUE;
		int sechighest = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>highest) {
				sechighest=highest;
				highest=num[i];
			}
			
			
			if(num[i]<highest && num[i]>sechighest) {
			     sechighest=num[i];
				
			}
				
			}
			System.out.println(sechighest);*/
			
	
		
		
		 // ***************************************************************
		
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
		
		for(Map.Entry<Character, Integer>data:sett) {
			if(data.getValue()>1) {
				System.out.println(data.getValue()+" : "+data.getKey());
			}
		}
		
		
	}

}
