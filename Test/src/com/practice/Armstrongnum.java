package com.practice;

public class Armstrongnum {

	public static void main(String[] args) {
		
		int num=154;
		int sum=0;
		int r;
		int temp;
		
		temp=num;
		
		while(num>0) {
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}

	}

}
