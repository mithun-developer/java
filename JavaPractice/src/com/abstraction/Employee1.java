package com.abstraction;


// Abstract class extend to another class and implement multiple interfaces.

public abstract class Employee1 extends Company2{
	
	
	abstract void doctor();
	abstract void lawyer();
	abstract void engineer();
	abstract void cricketer();
	abstract void actor();
	
	public static void main(String args[]) {
		
		
		Company2 comp = new Company2();
		comp.carpenter();
		comp.mechanic();
		comp.painter();
		comp.mason();
		comp.watchman();
		
		System.out.println("********************************");
		
		comp.welder();
		comp.fitter();
		comp.plumber();
		comp.labour();
		comp.electrician();
		
		System.out.println("********************************");
		
		comp.biscuit();
		comp.chacolate();
		comp.oil();
		comp.cement();
		comp.rubber();
	
	}

}
