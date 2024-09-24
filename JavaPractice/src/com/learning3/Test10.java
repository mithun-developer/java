package com.learning3;

import java.util.Scanner;

public class Test10 {
	
	
	 public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number"); 
		 

	       int userInput= sc.nextInt();
	           

		 
		  switch(userInput) {
		  case 1:
			  System.out.println("Got 1");
			  break;
		  case 66:
			  System.out.println("Got 66");
			  break;
		 default:
			  System.out.println("Got something else");
			
		  }
		 
		 
		
	 }

}
