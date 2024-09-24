package com.programmes;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		int num=121;
		int sum=0;
		int temp;
		int r;
		
		temp=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number");
		}
		

		
		
		
	
	}

}
