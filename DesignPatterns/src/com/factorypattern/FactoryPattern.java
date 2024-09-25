package com.factorypattern;

import com.factorypattern.phone.Android;
import com.factorypattern.phone.OS;
import com.factorypattern.phone.OperatingSystemFactory;

public class FactoryPattern {

	public static void main(String[] a) {
		
		OperatingSystemFactory os = new OperatingSystemFactory();
		
		OS obj = os.getInstance("rter");
		obj.spec();
		

	}

}
