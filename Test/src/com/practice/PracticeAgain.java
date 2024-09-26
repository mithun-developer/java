package com.practice;

import java.util.Arrays;

public class PracticeAgain {
	
	
	public static void main(String args[]) {
		
		
		
		              //Second Highest Number in an Array
				//***************************************************************
		int num[]= {3,-6,99,77,82,42,36,99,23,25};
		
		int highest = Integer.MIN_VALUE;
		int sechighest = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]> highest) {
				sechighest=highest;
				highest=num[i];
			}
			
			if(num[i]<highest && num[i]>sechighest) {
				sechighest=num[i];
			}
		}
		
		System.out.println(sechighest);
		
		
		

		//*********************************************************************	
                		 // Palindrome number
		
	
		
		int number =121;
		int sum=0;
		int r;
		int temp;
		
		temp=number;
		
		while(number>0) {
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		
		
		
  		// String swapping with out 3rd variable

		//*********************************************************************	
		
			String aa = "mithun";
			String bb="keerthana";
			aa= aa+bb;
			bb = aa.substring(0, aa.length()-bb.length());
			aa = aa.substring(bb.length());
			System.out.println(bb);
		
		

                          //    String Rotation
                        //**********************

			String m = "mithun";
		
		String newname = m.concat(m);
		String key = "hunmit";
		
		if(newname.contains(key)) {
			System.out.println("Rotation");
		}else {
			System.out.println("NonRotation");
		}
		
		// Write a java program to reverse a given string with preserving the position of spaces
		
		
		String name = "mithun learning java";
		char[]a = name.toCharArray();
		int size = a.length;
		
		char b[] = new char[size];
		
		for(int i=0;i<name.length();i++) {
			if(a[i]==' ') {
				b[i]=' ';
			}
		}
		
		int j = b.length-1;
		
		for(int i=0;i<name.length();i++) {
			if(a[i]!=' ') {
				if(b[j]==' ') {
					j--;
				}
				b[j]=a[i];
				j--;
				
			}
			
			
		}
		
		System.out.println(b);
		
		
		
	                                   	 //Anagram
                                        // *******
		
		
		String x = "silent";
		char xx[] = x.toCharArray();
		String y = "listen";
		char yy[] = y.toCharArray();
		
		Arrays.sort(xx);
		Arrays.sort(yy);
		
		boolean res =	Arrays.equals(xx,  yy);
		
		if(res==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Non Anagram");
		}
		
		
		
		                   // reverse each word of a given string
                   		// *********************************************

		
		
		String str = "mithun learning java";
		
		String words [] = str.split(" ");
		
		String reversestring=" ";
		
		for(String w:words) {
			String reverseword = " ";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseword = reverseword+w.charAt(i);
			}
			
			reversestring=reversestring+reverseword;
			
		}
		
		
		System.out.println(reversestring); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	

}
