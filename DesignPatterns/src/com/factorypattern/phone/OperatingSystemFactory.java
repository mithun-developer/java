package com.factorypattern.phone;

public class OperatingSystemFactory {

	public static void main(String[] args) {
		
		

	}
	
	public OS getInstance(String str) {
		if(str.equals("good")) {
			return new Android();
		}else if(str.equals("ok")) {
			return new IOS();
		}else {
			return new WindowsOS();
		}

	}

}
