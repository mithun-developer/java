package com.learning;

public class Poly {
	
	//Method Overloading
	
	void method1(int x){
		System.out.println(x);
	}
	
	void method1(int x, String name) {
		System.out.println(x+name);
		
	}
	
	void method1(float x,int y) {
		System.out.println(x+y);
	}
	
	void method2(){
		System.out.println("parent");
	}
	
	public static void main(String args[]) {
		Poly p = new Poly();
		p.method1(8);
	}

	
	
	
}
