package com.decoratorpattern.phone;


//Decorator (Which adds some more features to the smart phone)

public abstract class SmartPhone implements Phone{
	
	

	private final Phone phone; //(This is used to decorate Phone by using the constructor argument.)

	public SmartPhone(Phone phone) {
		this.phone=phone;
		
	}
	
	public String build() {
		return phone.build();
	}

}
