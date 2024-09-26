package com.practice;
import java.util.*;

public class PracFalindrome {
	
	
	
	public static void main(String args[]) {
		
		             //String Reverse
		String name = "keerthana";
		String names = "Java Concept Of The Day";
		
		char a[] = names.toCharArray();
		int size = a.length;
		
		LinkedHashMap  <Character,Integer>  map = new LinkedHashMap();
		
		/*char [] b= new char[size];
		
		int i=0;
		while(i !=size) {
			b[size-1-i]=a[i];
			i++;
		}
		
		System.out.println(b);*/
		
		                 //String Reverse - 2nd type
		
		/*for(int i=size-1;i>=0;i--) {
			System.out.print(a[i]);
			
			
			
		}
		*/
		
            		//String Reverse - 3rd type ------> Reverse Each Word Of A String
		
	
		
		/*String words[] = names.split(" ");
		String reversestring = " ";
		for(String w:words) {
			String reverseword = " ";
		 for(int i=w.length()-1;i>=0;i--) {
			 reverseword=reverseword+w.charAt(i);
		 }
		 reversestring= reversestring+reverseword;
		
		}
		
		System.out.println(reversestring);
		*/
		
		//*********************************************************************	
		
                  		// String swapping with out 3rd variable
		
		/*name = name+names;
		names = name.substring(0, name.length()-names.length());
		
		name = name.substring(names.length());
		
		System.out.println(name);
		System.out.println(names);*/
		
		//*********************************************************************	
                		 // Palindrome number
	/*	
		int num=1321;
		int sum=0;
		int r ;
		int temp;
		
		temp= num;
		
		while(num>0) {
			r=num%10;
			
			sum=(sum*10)+r;
			
			num=num/10;
			
		}
		
		if(temp==sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		*/
		
	//*********************************************************************	
		                 //Prime Numbers
		
		/*int num=100;
		
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
		}
		
		*/
		
		//*********************************************************************	
		
		 //Second Highest Number in an Array
		
		
		/*int num[]= {3,-6,99,77,82,42,36,99,23,25,98};
		
		
		int highest = Integer.MIN_VALUE;
		
		int sechighest = Integer.MIN_VALUE;
		
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>highest) {
				sechighest = highest;
				highest = num[i];
				
			}
			
			if(num[i]<highest && num[i]>sechighest) {
				
				sechighest = num[i];
				
			}
			
		}
		
		System.out.println(sechighest);*/
		
		
		
	    	  //Number of occurrences of a given character in a string without loop
             //***************************************************************
		
		/*char c = 'i';
		
		int cc = name.length()-name.replaceAll("i", "").length();
		
		System.out.println(cc);
		*/
		

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
		
		System.out.println(map);*/
		
		
		
		
		
		         //Remove whitespaces
              //**********************
		
		/*String aa =  "mithun           learning java";
		
	aa=	aa.replaceAll("\\s", "");
		System.out.println(aa);
*/
		
		
		            //Duplicate characters in a string
                   //********************************
	
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
	
		
    Set<Map.Entry<Character, Integer>> sett = map.entrySet();
		
		for(Map.Entry<Character, Integer> data:sett) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
			}
			
		}*/
		
		
		

                              //String Rotation
                           //**********************
		
	/*String	newname = name.concat(name);
		String key="hunmit";
		
		if(newname.contains(key)) {
		System.out.println("Rotational string");
		}else {
			
			System.out.println("Non Rotational string");
		}
		*/
		
                         		 //Anagram
                               // *******

		/*String x = "silent";
		char xx[] = x.toCharArray();
	
		String y = "listen";
		char yy[] = y.toCharArray();
		
		Arrays.sort(xx);
		Arrays.sort(yy);
		
		boolean res = Arrays.equals(xx, yy);
		
		if(res==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Non Anagram");
		}
		*/
		
		
		   //String to Integer
        //**********************

		// int i =Integer.parseInt(name);
		
		
		
		 //Integer to String
        //**********************

	//	Integer.toString(i);
		
		 //Remove duplicate characters 
        //******************************

		
		
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
	
		
    Set<Map.Entry<Character, Integer>> sett = map.entrySet();
		
		for(Map.Entry<Character, Integer> data:sett) {
			if(data.getValue()==1) {
				System.out.print(data.getKey());
			}
			
		}
		*/
		
		
		  //Reverse string preserving spaces
		   //******************************
		/*String neme="mithun learing java";
		
		char[] a = neme.toCharArray();
		int size = a.length;
		char [] b = new char[size];
		
		for(int i=0;i<size;i++) {
			if(a[i]==' ') {
				b[i]=' ';
			}
	}
		
		int j = b.length-1;
		for(int i=0;i<size;i++) {
			if(a[i]!=' ') {
				if(b[j]==' ') {
					j--;
				}
				
				b[j]=a[i];
				j--;
			}

	}
		System.out.println(b);*/
		
		       //Reverse string each word
		   //******************************
		
		/*String word [] =names.split(" ");
		
		String reversestring =" ";
		
		for(String w:word) {
			String reverseword = " ";
		
		 for(int i=w.length()-1;i>=0;i--) {
			 reverseword=reverseword+w.charAt(i);
		 }
		 reversestring=reversestring+reverseword;
		 
		}
		
		
		System.out.println(reversestring);*/
		
		
		
		// String swapping with out 3rd variable
		
		/*String a ="mm";
	
		String b= "keerthana";
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		
		a= a.substring(b.length());
		
		System.out.println(a);
		*/
		
		
		           //Triangle
		   //******************************
	/*	int num =10;
		for(int i=0;i<=num;i++) {
		for(int j=0;j<=num-i;j++) {
				System.out.print(" ");
				
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		               // Vowels
		   //******************************
		/* int vowels=0;
		 int consonants=0;
		 int splchar=0;
		 
		 
		 
		 int i=0;
		 while(i !=size) {
			 if(a[i]>='a'&& a[i]<='z') {
				 if(a[i]=='a'|| a[i]=='e'|| a[i]=='i'||a[i]=='o'||a[i]=='u') {
					 vowels++;
				 }else {
					 consonants++;
				 }
			 }else {
				 splchar++;
			 }
			 i++;
		 }
		 
		 System.out.println("vowels:"+" "+vowels);
		 System.out.println("consonants:"+" "+consonants);
		 System.out.println("splchar:"+" "+splchar);
		 
		 */
		 
		          // Third largest Element

	          	 //******************************
					
				
		int num[]= {3,-6,99,77,82,88,42,36,69,23,25,98};
		
		
		int highest = Integer.MIN_VALUE;
		int sechighest = Integer.MIN_VALUE;
		int thhighest = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>highest) {
				thhighest=sechighest;
				sechighest=highest;
				highest=num[i];
			}else if( num[i]>sechighest) {
				thhighest=sechighest;
				sechighest=num[i];
			}else if(num[i]>thhighest) {
				thhighest=num[i];
			}
		}
		
		System.out.println(thhighest);
		
		System.out.println(name.getClass());
		System.out.println(String.class);
		
		try {
			System.out.println(Class.forName("java.lang.String"));
		}catch(Exception e) {
			
		}
		System.out.println("**************");
		System.out.println();
		
		
		 // find duplicate elements in an array
		//**************************************************
		
		/*String[] abc = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		
		HashSet set = new HashSet();
		
		for(String a:abc) {
			if(!set.add(a)) {
				System.out.println(a);
			}
		}*/
		
		
		
	}

}
