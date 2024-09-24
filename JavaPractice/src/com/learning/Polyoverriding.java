package com.learning;

public class Polyoverriding extends Poly{
	
	void method2() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Poly p = new Poly();   // Object created for parent class
		p.method2();
	}
}
