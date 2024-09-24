package com.inner;

public class MettodLokal {
	
	void method1() {
		class Inner{
			void method2() {
				System.out.println("Method Inner local");
			}
		}
	
	  Inner i = new Inner();
	  i.method2();
	}

	
	public static void main(String args[]) {
		MettodLokal ml = new MettodLokal();
		ml.method1();
	  }
	
}
