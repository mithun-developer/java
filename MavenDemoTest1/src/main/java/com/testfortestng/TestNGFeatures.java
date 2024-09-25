package com.testfortestng;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	  @Test 
	   	
	   	public void logintest() {
	   		int i=4/0;
	   	 	System.out.println("login Test");
	   		
	   	}
	       
	    
	  @Test (dependsOnMethods="logintest")
	      	
	       public void homepagetest() {
		   		
		   	 	System.out.println("home page Test");
		   		
		   	}
	       
	       
}
