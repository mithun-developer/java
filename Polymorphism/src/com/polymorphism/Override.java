package com.polymorphism;

public class Override {
	
	void msg() {
		System.out.println("Parent method");
	}

public static void main(String args[]) {
		
	Override o = new Override();
		o.msg();
	}
	
	
}


class Mob extends Override{
	
	void msg() {
		System.out.println("Child method");
	}
	
	
	
}
