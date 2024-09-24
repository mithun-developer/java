package com.learning;

public class Anonimus {
	void display() {
		System.out.println("first");
	}

}

class Anonimus1{
	public static void main(String args[]) {
		Anonimus a = new Anonimus();
		a.display();
	}

}