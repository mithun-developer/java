package com.programmes;

public class Lower_To_Upper_Case {

	public static void main(String[] args) {
	
		String name="mithun is learning java";
		char a[] = name.toCharArray();
		int size = a.length;
		
		int i=0;
		
		while(i !=size) {
			a[i]=(char) (a[i]-32);
		i++;
		}
		
		System.out.println(a);

	}

}
