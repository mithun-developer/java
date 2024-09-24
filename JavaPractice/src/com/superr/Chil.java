package com.superr;

public class Chil extends Superr {
	
	
	// Even if we comment it, this constructor will be called by JVM and execute super method in parent class.
	Chil(){
		super();
	}
	
	//int x =10;
	
	public void method1() {
		/*int x=20;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);*/
		System.out.println("From child class");
		
		super.method1();
	}

	 public static void main(String args[]) {
		 Chil c = new Chil();
		
		 c.method1();
		
		// s.method1();
	 }
}
