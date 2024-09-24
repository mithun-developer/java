package com.learning2;

public class NoOPerator {
	
	
public static void main(String args[]) {
	
		
	
	
	int a=10;
	int b=20;
	int sum=0;
	int carry=0;
	
	while(b!=0) {
		sum=a^b;
		carry=a&b;
		a=a^b;
		b=carry<<1;
		
	}
	
	System.out.println(sum);
		
}


}