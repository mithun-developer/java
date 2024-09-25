package com.testfortestng;

import org.testng.annotations.Test;

public class ExceptionTimeOuttest {
	
	@ Test(invocationTimeOut=1000)
	public void infiniteloop() {
		int i=1;
		
		while(i==1) {
			System.out.println(i);
			
		}
	}

}
