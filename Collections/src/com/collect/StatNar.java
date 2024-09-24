package com.collect;

public class StatNar {
	
	int a=10;
	static int b=40;
	
	static class Subclass{
		void method1(StatNar x) {
			System.out.println("From method 1");
			System.out.println("The value of a:"+x.a);
		}
		
		static void method2(StatNar x) {
			System.out.println("From method 2");
			System.out.println("The value of a:"+x.a);
		}
	}
	Subclass sub = new Subclass();
	public static void main(String args[]) {
		StatNar nar = new StatNar();
		nar.sub.method1(nar);
		nar.sub.method2(nar);
	}
	
	
	}
	
	

