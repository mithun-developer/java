package com.programmes;

public class Sum_Of_All_Digits_Of_Number {

	public static void main(String[] args) {
		
		
		int num=123;
		int sum=0;
		
		
		String str = Integer.toString(num);
		
		for(int i=0;i<str.length();i++) {
			sum=sum+Character.getNumericValue(str.charAt(i));
			
		}
		
		System.out.println(sum);
		
		
		
	

	}

}
