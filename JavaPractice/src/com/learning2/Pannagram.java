package com.learning2;

public class Pannagram {
	public static void main(String args[]) {
		String name= "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		name=name.replace(" ", "");
		char[]a = name.toCharArray();
		int size= a.length;
		
		
		
		int b[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int i=0;
		while(i !=size) {
			int index=a[i]-65;
			b[index]=1;
			i++;
		}
	
		i=0;
		while(i !=26) {
			if(b[i]==1) {
				i++;
			}else {
				
				System.out.println("Not pangram");
				System.exit(0);
			}
		}

		
		System.out.println("Pangram");
	}
}
