package com.learning4;

public class PalindromeNumber {
	
	public static void main(String args[]) {
		
	
		int num=131;
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
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome number");
		}
		
		
		

		
	}

}
