package com.learning2;

public class PaliandromOnall {
	
	public static void main(String args[]) {
		String name="M   alaYalam";
		name=name.replace(" ", "");
		name=name.toLowerCase();
	 char[]a = name.toCharArray();
	 
	 int size=a.length;
	char[]b=new char[size];
	
	
	int i=0;
	while(i !=size) {
		b[size-1-i]=a[i];
		i++;
	}
	
	i=0;
	while(i !=size) {
		if(b[i]!=a[i]) {
			System.out.println("Not palindrome");
			System.exit(0);
		}
	
	i++;
	}
	
	System.out.println("palindrome");
	}

}
