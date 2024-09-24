package com.collect;


//To access non static variable from static method in java
public class Reg {
	int a=10;
	static int b=20;
	
	static class Inner{
		static void method1(Reg x) {
			System.out.println("First method");
			System.out.println("The value of a:"+x.a);
		}
	    void method2() {
	    	System.out.println("Second method");
			System.out.println("The value of b:"+b);
	    }
	
	   
	    }// end  static class
	
	 Inner i = new Inner();
	    public static void main(String args[]) {
	    	Reg r = new Reg();
	   r.i.method1(r);
	   r.i.method2();
	}
	
}// non static class end
	
	
		
	
	
	

