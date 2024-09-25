package com.decoratorpattern;

import com.decoratorpattern.phone.AndroidPhone;
import com.decoratorpattern.phone.BasicPhone;
import com.decoratorpattern.phone.IPhone;
import com.decoratorpattern.phone.NokiaPhone;
import com.decoratorpattern.phone.Phone;
import com.decoratorpattern.phone.WindowsPhone;

public class DecoratorPattern {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone  = new AndroidPhone(new BasicPhone());
		System.out.println(androidPhone.build());
		
		
		IPhone iPhone  = new IPhone(new BasicPhone());
		System.out.println(iPhone.build());
		
		
		
		NokiaPhone nokiaphone  = new NokiaPhone(new WindowsPhone(new BasicPhone()));
		System.out.println(nokiaphone.build());
		
		NokiaPhone nokiaandroidphone  = new NokiaPhone(new AndroidPhone(new BasicPhone()));
		System.out.println(nokiaandroidphone.build());

	}

}
