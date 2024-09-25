package com.decoratorpattern.phone;


// BasicPhone is implementation of Phone interface (which builds a phone with basic features Screen, Battery, Processor)

public class BasicPhone implements Phone{

	public static void main(String[] args) {
		

	}

	@Override
	public String build() {
		
		return "Screen, Battery, Processor";
	}

	

}
