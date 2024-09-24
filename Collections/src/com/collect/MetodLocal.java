package com.collect;

public class MetodLocal {
	
	void first() {
		class MetodLocal1{
			void second() {
				System.out.println("Method local inner class");
			}
		
		}
		
		MetodLocal1 ml = new MetodLocal1();
		ml.second();
		
	}

	public static void main(String args[]) {
		MetodLocal m = new MetodLocal();
		m.first();
	}
	
}
