package com.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Allprogrammes {
	
	public static void main(String args[]) {
		
		//Palindrome string
		//****************
		
           String name="mithun modali";
           String names="modali";
         /* char []a = name.toCharArray();
           int size = a.length;
           */
         //  char[] b = new char[size];
           
        /*   int i=0;
           
           while(i !=size){
        	   
           b[size-1-i]=a[i];
           
           i++;
		
		
           }
		
		i=0;
		
		while(i !=size) {
			
			if(b[i]!=a[i]) {
				System.out.println("Not palindrome");
				System.exit(0);
			}else {
				i++;
			}
		}
		
		System.out.println("palindrome");*/
           
           
           //String Reverse  -  1st way
           //*********************
           
           /*char a[] = name.toCharArray();
           
           int size = a.length;
           
           char b[] = new char[size];
           
           int i=0;
           
           while(i !=size) {
        	   b[size-1-i]=a[i];
        	   i++;
           }
           
           System.out.println(b);*/
           
          
           
           //String Reverse  -  2nd way
           //*********************
           
           
         /*  for(int i=name.length()-1;i>=0;i--) {
        	   System.out.print(a[i]);
           }
           */
           
           
          // String swapping
         //  ***************
          /* name=name+names;
           
        names=name.substring(0, name.length()-names.length());
        name=name.substring(names.length());
        
        System.out.println(name);
        System.out.println(names);
           
           
           
           
           */
           
           
         //  Palindrome number
         //  ****************
           
          /* int x = 121;
           int sum=0;
           int temp;
           int r;
           
           temp=x;
           
           while(x>0) {
        	   r=x%10;
        	   sum=(sum*10)+r;
        	   x=x/10;
        	   
           }
           
           if(temp==sum) {
        	   System.out.println("Palindrome number");
           }else {
        	   System.out.println("Not Palindrome number");
           }*/
           
           
           
           //Prime Numbers
          //************
           
         /*  int a =100;
           
           for(int i=1;i<a;i++) {
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
           
           
           
          // Second Highest Number in an Array
         //  ********************************
           /*int num[]={55,23,-5,22,82,34,75,99};
           
           
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
           
           
           
                      //Triangle
                     //**************
           
           int a= 10;
           for(int i=0;i<a;i++) {
        	   for(int j=0;j<a-i;j++) {
        		   System.out.print(" ");
        	   }
        	   for(int k=0;k<i;k++) {
        		   System.out.print("* ");
        	   }
        	   System.out.println();
           }
           
           
           
              //Triangle border line
           //************************
           
           
          /* int num=10;
           for(int i=0;i<num;i++) {
        	   for(int j=0;j<i;j++) {
        		   
        		   if(j==0 || j==i-1) {
        			   System.out.print("*");
        		   }else {
        			   System.out.print("");
        		   }
        		   System.out.println("");
        	   }
        	   
        	   for(int j=0;j<num;j++) {
        		   System.out.println("*");
        	   }
        	   
           }
           for (int k = 0; k < 10; k++) {
   			System.out.print("*");
   		}
           */
           
           
           
           
           
           
          // Number of occurrences of a given character in a string without loop
          // *******************************************************************
           
         
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           //Number of occurrences of each character in a string
           //***************************************************
           
          /* LinkedHashMap<Character,Integer> map = new LinkedHashMap();
           
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
           
           System.out.println(map);
           */
           
           
          // Remove whitespaces
         //  ******************
           
           
          /* name = name.replaceAll("\\s", "");
           System.out.println(name);
           */
           
         //  Duplicate characters in a string
         //  ********************************
           
        /*   LinkedHashMap<Character,Integer> map = new LinkedHashMap();
           
           int i=0;
           while(i!=size) {
        	   if(map.containsKey(a[i])==false) {
        		    map.put(a[i], 1);
        		   
        	   }else {
        		   int oldval = map.get(a[i]);
        		   int newval = oldval+1;
        		   map.put(a[i], newval);
        	   }
        	   i++;
           }
           
           Set<Map.Entry<Character,Integer>> sett = map.entrySet();
           
        for( Map.Entry<Character,Integer> data:sett) {
        	if(data.getValue()>1) {
        		System.out.println(data.getKey());
        	}
        }*/
           
           
           //String Rotation
           //***************
           
         /*  String newname= name.concat(name);
           
           String keystr = "hunmit";
           
           if(newname.contains(keystr)) {
        	   System.out.println("Rotational String");
           }else {
        	   System.out.println("Non Rotational String");
           }*/
           
           
           
                                       // Anagram
                                  //  *****************
           
           
         /*  String a ="silent";
         
           String b="listen";
           
           char aa[] = a.toCharArray();
           
           char bb[] = b.toCharArray();
           
           Arrays.sort(aa);
           Arrays.sort(bb);
           boolean res = Arrays.equals(aa,bb);
           
           if(res==true) {
        	   System.out.println("Anagram");
           }else {
        	   
           System.out.println("Non Anagram");
           }*/
           
           
           
          // String to Integer
         //  ****************
           
          /*  String str="6";
           int x = Integer.parseInt(str);
           System.out.println(x);
           */
    
           //  Integer to String
           //  ****************
             /*  int x=6;
            Integer.toString(x);
           System.out.println(x);
           */
           
           
           //Remove duplicate characters 
          // ***************************
          


           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           //Maximum occurring character in a String 
           //***************************************
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
		
	}

}
