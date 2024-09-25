package com.decoratorpattern.phone;


//Concrete implementation with additional responsibilities - ADDING OS 

public class IPhone extends SmartPhone{

	public IPhone(Phone phone) {
		super(phone);
		
	}
	
	public String build() {
		return super.build() + addos();
		
	}
	
	
private String addos() {
		
		return "Iphone Version 12";
	}

}
