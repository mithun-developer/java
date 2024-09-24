package com.inner;

public class StatIn {
	private int a =10; //non static variables
	static int b=20;// static variables
	
	static class Inner{
	static	void method1(StatIn x) {
			System.out.println("From first method");
			System.out.println("The value of a:"+x.a);
		}
		void method2(StatIn x) {
			System.out.println("From second method");
			System.out.println("The value of a:"+x.a);
		}
		
	}
	Inner i =new Inner();
	public static void main(String args[]) {
		
		StatIn st = new StatIn();
		st.i.method1(st); // method call
		st.i.method2(st); // method call
		
	}
	
	
}
