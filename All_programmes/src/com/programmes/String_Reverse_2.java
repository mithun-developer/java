package com.programmes;

public class String_Reverse_2 {

	public static void main(String[] args) {
		String name="mithun";
		char[]a = name.toCharArray();
		int size = a.length;
		
		char[] b = new char[size];
		
		int i=0;
		
		while(i !=size) {
			b[size-1-i]=a[i];
			i++;
		}

		System.out.print(b);
	}

}
