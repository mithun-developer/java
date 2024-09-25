package com.testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void infiniteloop() {
		
	int i=6/0;
	}

}
