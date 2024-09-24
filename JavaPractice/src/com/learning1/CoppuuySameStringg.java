package com.learning1;

public class CoppuuySameStringg {
	
	public static void main(String args[]) {
		String name="Mithun";
	   char[]a = name.toCharArray();
	  
	char[]b=new char[6];
	
	int i=0;
	
	while(i !=a.length) {
		b[i]=a[i];
	i++;
	}
	System.out.println(a);
	System.out.println(b);
	
	}

}
