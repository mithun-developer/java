package com.decoratorpattern.phone;


//Concrete implementation with additional responsibilities - BRANDING 
public class NokiaPhone extends SmartPhone{

	public NokiaPhone(Phone phone) {
		super(phone);
		
	}
	
	public String build() {
		return super.build() + addbranding() +model();
		
	}
	
	public String addbranding() {
		return "Microsoft Phone";
		
	}
	
	
	public String model() {
		return "1000000";
		
	}

}
