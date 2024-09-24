package com.learning1;

public class FirestLetCappital {

	public static void main(String args[]) {
		
		String name="mithun is a java developer";
		
		
		char[]a = name.toCharArray();
		int size=a.length;
		
		a[0]=(char) (a[0]-32);
		
		for(int i=1;i<size;i++) {
			if(a[i]==' ') {
				a[i+1]=(char) (a[i+1]-32);
			}
			
		}
		
		System.out.println(a);
		
	}
	
}
