package com.learning2;

import java.util.Arrays;

public class SwappStirng {
	
	
		
		 public static void main(String[] args) 
		    {
		       /* String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		  for(int i=0;i<strArray.length-1;i++) {
			  for(int j=i+1;j<strArray.length;j++) {
				  if(strArray[i]==strArray[j]) {
					  System.out.println(strArray[j]);
				  }
			  }
			  
			  
		  }*/
		  
		  
		  // swaping
		  
		  
			 
			/* String a = "mithun";
			 String b="keerthana";
			 
			 a=a+b;
			 b= a.substring(0, a.length()-b.length());
			 a=a.substring(b.length());
			 
			 System.out.println(a);
			 System.out.println(b);
			 */
			 
			 // find number of occurence of character in string without loop
			 
			 
			/* String name="keerthana";
			 
			 char c='e';
			 
			int count=name.length()-name.replaceAll("r", "").length();
			
			System.out.println(count);*/
			 
			 
			 
			//palindrome number 
			 
			 /*int r;
			 int sum=0;
			 int temp;
			 int n=121;  //It is the number variable to be checked for palindrome  
			   
			   temp=n;    
			   while(n>0){    
			    r=n%10;  //getting remainder  
			    sum=(sum*10)+r;    
			    n=n/10;    
			   }    
			   if(temp==sum)    
			    System.out.println("palindrome number ");    
			   else    
			  System.out.println("not palindrome");    

			 */
			 
			 
			 
			 
			 // prime numbers
			 
			/*int num=1000;
			
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
			 
			//second highest number in array
			 
			/*int arr[]= {1,9,7,8,6,12,99,58,7};
			Arrays.sort(arr);
			
			 System.out.println(arr[arr.length-2]);*/
			 

			 
			 //palindrome number
			 
			/* int r;
			 int sum=0;
			 int temp;
			 int num=121;
			 
			 temp=num;
			 
			 while(num>0) {
				 r=num%10;
				 sum=(sum*10)+r;
				 num=num/10;
			 }
			 if(temp==sum) {
				 System.out.println("palindrome");
			 }else {
				 System.out.println("not");
			 }
			 */
			 
			 
			 // second higheest number
			 
			 
			//int x[]= {22,66,52,84,99,14,22,35,-1,99};
			 
			/*Arrays.sort(x);
			
			System.out.println(x[x.length-2]);
			 */
			 
			
			 
		/*	 int highest = Integer.MIN_VALUE;
			 int secondHighest = Integer.MIN_VALUE;
			
			 for(int i = 0; i < x.length; i++) {
			 if(x[i] > highest) {
			 secondHighest = highest;
			 highest = x[i];
			 }
			 if(x[i] < highest && x[i] > secondHighest) {
			 secondHighest = x[i];
			 }
			 }
			 System.out.println(secondHighest);

		
		}*/
			
		    	
		
			 int x[]= {22,66,52,84,99,14,22,35,-1,99};
				
			 int highest=Integer.MIN_VALUE;
				int sechighest=Integer.MIN_VALUE;
				
				for(int i=0;i<x.length;i++) {
					if(x[i]>highest) {
						sechighest=highest;
						highest=x[i];
					}
					
					if(x[i]<highest && x[i]>sechighest) {
						sechighest=x[i];
					}
		
				}
			
				System.out.println(sechighest);

		       
				
				//sum of 10000 numbers
			 int sum=0;
			 for(int i=0;i<=10000;i++) {
				 sum=sum+i;
			 }
			 System.out.println(sum);
			 
			 
		    }    
}
