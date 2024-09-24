package com.modifiers;

public class Class_A {

	static private int x=10; // Private can be accessed only in this class
	 
	int y=20; // Default can be accessed only in this package
	
	protected int z=30; // protected can be accessed  in this package and in child class of other package...For eg. Class D
	
	public String name="Mithun";
	
	public static void main(String args[]) {
		
		
		
	}
	
	
	
	// Private method for Reflection
	private void show() {
		System.out.println("Accessing private method from another class ");
	}
}
