package com.abstraction;


 // An abstract class can implement multiple interfaces.

public abstract class Company3 implements Company1,Factory1,Industry1 {
	
	
	protected void swimmer() {
		System.out.println("Teaches swimming");
	}
	
	public void driver() {
		System.out.println("Teaches driving");
	}
	
	public void faculty() {
		System.out.println("Teaches accounting");
	}

	

}
