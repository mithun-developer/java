package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Parameters
	public void loginTest() {
		System.out.println("Login Test");
		int i=5/0;
	}
	
	@Test(retryAnalyzer=com.analyzer.Retry.class)
	public void homePageTest() {
		System.out.println("Home Page Test");
	}
	
	
}
