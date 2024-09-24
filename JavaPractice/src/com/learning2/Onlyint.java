package com.learning2;

public class Onlyint {
	
	
	public static void main(String args[]) {
		String name="3455";
		
		name=name.toLowerCase();
		char[]a=name.toCharArray();
		int size=a.length;
		
		int i=0;
		while(i !=size) {
			if(a[i]>='0' && a[i]<='9' || a[i]=='-') {
				i++;
			}else {
				System.out.println("Not Integer");
				System.exit(0);
			}
		
		
		}
		
		System.out.println("Integer");
	}

}
