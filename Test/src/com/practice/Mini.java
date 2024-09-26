package com.practice;

public class Mini {
	
	public static void main(String args[]) {
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//without 
		
		String name = "mithun learning java";
		char[]a = name.toCharArray();
		int size = a.length;
		char b[] = new char[size];
		
		
		
		for(int i=0;i<size;i++) {
			if(a[i]==' ') {
				b[i]=' ';
			}
			
	
			}
		int j = b.length-1;
		
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


