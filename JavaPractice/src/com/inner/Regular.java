package com.inner;

public class Regular {
	class Inner{
		void method1() {
			System.out.println("First Method- Inner");
		}
		
	}
	
	void method2() {
		System.out.println("Second Method- Outer");
		
	}
	
	public static void main(String args[]) {
		 Regular r  = new Regular();
		 r.method2();
		 Regular.Inner ri = new Regular().new Inner();
		 ri.method1();
		 
		 
		 
			}
	
	
	
}
