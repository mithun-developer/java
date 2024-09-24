package com.learning1;

public class ReverseStringPreservingSpace {

	public static void main(String[] args) {
		
		
		String name= "mithun learing java";
		
		char []a = name.toCharArray();
		int size = a.length;
		char b[] = new char[size];
		
		
		for(int i=0;i<size;i++) {
			if(a[i]==' ') {
				b[i]=' ';
			}
		}
		
		
		int j= b.length-1;
		for(int i=0;i<size;i++) {
			if(a[i]!=' ') {
				if(b[j]==' ') {
					j--;
				}
				
				b[j]=a[i];
				j--;
			}
		}
		
		System.out.println(b);
	}

}
