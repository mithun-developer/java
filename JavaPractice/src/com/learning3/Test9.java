package com.learning3;

import java.util.Scanner;

public class Test9 {
   public static void main(String args[]) {
		
		int i=0;
		 int value = 0;
	        Scanner scanner = new Scanner(System.in);

	        while(value != 5) {
	            System.out.println("Enter the number 5: ");

	            if(scanner.hasNextInt()) {
	                value = scanner.nextInt();
	            }
	            else {
	                scanner.nextLine();
	            }
	        }

	        System.out.println("Got it!");

	    
	}

}
