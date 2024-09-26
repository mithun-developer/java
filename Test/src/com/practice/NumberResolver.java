package com.practice;

public class NumberResolver {
	
	public static void main(String args[]) {
		int num=100;
	      int a= 3 , b=5;
			  int x=0;
			  int y=0;
			  
		for(int i=1;i<=num;i++) {
			x=a*i;
			y=b*i;
		
			
			if(i%3==0) {
				System.out.println("MThree");
			}else if(i%5==0){
				System.out.println("MFive");
			}else if(i%3==0 && i%5==0) {
				System.out.println("Resolver");
			}else {
				System.out.println(i);
			}
	
		
		}
		
         }
		
	}


