package com.practice;

public class Singleton {
	
	private static Singleton snglton = null;
	
	public String str;
	
	private Singleton() {
		str = "singleton class pattern";
	}
	
	
	public static Singleton getInstance() {
		if(snglton==null) {
			snglton = new Singleton();
		}
		return snglton;
		
	}

	
	
	public static void main(String args[]) {
		
		Singleton x = 	getInstance();
		Singleton y = 	getInstance();
		Singleton z = 	getInstance(); 
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
}
