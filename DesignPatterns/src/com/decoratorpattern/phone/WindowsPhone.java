package com.decoratorpattern.phone;


//Concrete implementation with additional responsibilities - ADDING OS 
public class WindowsPhone extends SmartPhone{

	public WindowsPhone(Phone phone) {
		super(phone);
		
	}
	public String build() {
		return super.build() + addos();
		
	}

	private String addos() {
		
		return "Windows Version 10";
	}
	
	
	
	

}
