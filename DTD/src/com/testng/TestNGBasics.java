package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//Precondition annotations - starting with @Before
	
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system properties for chrome");
	}
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeClass
	
	public void login() {
		System.out.println("login to app");
	}
	
	
	

	@BeforeMethod
	
	public void enterUrl() {
		System.out.println("enter url");
	}
	
	//test cases- starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	//Postcondition annotations - starting with @After
	
      @AfterMethod
	
	public void logout() {
		System.out.println("logout from app");
	}
	
      
      @AfterClass
  	
  	public void closeBrowser() {
  		System.out.println("Close Browser");
  	}
    
	
      @AfterTest
  	
  	public void deleteCookies() {
  		System.out.println("Delete Cookies");
  	}
  	
    
     
      
	
}
