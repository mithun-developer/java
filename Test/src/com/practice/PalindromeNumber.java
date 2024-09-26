package com.practice;

public class PalindromeNumber {

	
	public static void main(String args[]) {
		
	int num=121;
	int sum=0;
	int r;
	int temp;
	
	temp=num;
	
	while(num>0) {
	r=num%10;
	sum=(sum*10)+r;
	num=num/10;
	
		
	}
	
	if(temp==sum) {
		System.out.println("palindrome");
	}else {
		System.out.println("Not palindrome");
	}
		
		
		
	}
}
