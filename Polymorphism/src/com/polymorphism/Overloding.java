package com.polymorphism;

public class Overloding {
	
	//without parameter
	
	void add() {
		System.out.println("0 parameter");
	}

	//with one parameter
	
	void add(int x) {
		System.out.println("1 parameter");
		
	}
	
	//with two parameters
	
	void add(int x , double y) {
		System.out.println("2 parameters");
	}
	
	//with three parameters
	void add(int x, double y , float z) {
		System.out.println("3 parameters");
		
	}
	public static void main(String args[]) {

		Overloding over = new Overloding();
		over.add(3, 3.3, 4.8f);
		over.add(4, 5.0);
		over.add(4);
		over.add();
	
	}

}
