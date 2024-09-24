package com.learning3;

public class Car {
	String name;
	Car(String name){
		this.name=name;
		
	}
	
	public void start() {
		System.out.println("Car started!");
	}

	
	public String getName() {
		return name;
	}
}
