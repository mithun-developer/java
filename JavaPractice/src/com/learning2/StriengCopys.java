package com.learning2;

public class StriengCopys {
	
	public static void main(String args[]) {
		String name="mithun";
	char[]a = name.toCharArray();
	int size=a.length;
	
	char[]b=new char[size];
	
	int i=0;
	while(i !=size) {
		b[i]=a[i];
		i++;
	}
	
	System.out.println(a);
	System.out.println(b);
		
		
		
		
		
		
	}

}
