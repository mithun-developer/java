package com.decoratorpattern.phone;


//Concrete implementation with additional responsibilities - ADDING OS 
public class AndroidPhone extends SmartPhone {

	public AndroidPhone(Phone phone) {
		super(phone);
	
	}
	
	public String build() {
		return super.build() + addos();
		
	}

	private String addos() {
		
		return "Android Version 11";
	}
	
	

}
