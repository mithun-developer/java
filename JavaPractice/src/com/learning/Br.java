package com.learning;

public class Br {
	void mla() {
		class Inside{
			void innerMethod() {
				System.out.println("Internal");
			}
		}

		Inside i =new Inside();
		i.innerMethod();
	
	}
	public static void main(String args[]) {
		Br b = new Br();
		b.mla();
	}

}
