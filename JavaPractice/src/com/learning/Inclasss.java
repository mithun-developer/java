package com.learning;

public class Inclasss {
	
	
	
	public class Test{
		void innerMethod() {
			System.out.println("From inner class");
		}
	}

	void outerMethod() {
		System.out.println("From outer class");
		
	}
	
	public static void main(String args[]) {
		Inclasss in = new Inclasss();
		in.outerMethod();
		
		Inclasss.Test t = new Inclasss().new Test();
		t.innerMethod();
				
				
	}
	
	
}
