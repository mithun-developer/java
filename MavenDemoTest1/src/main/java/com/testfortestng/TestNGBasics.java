package com.testfortestng;

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


	 // preconditions

	@BeforeSuite         // -----> 1

	public void setup() {

		System.out.println("1. setup system property for Chrome Browser");

	}


	@BeforeTest  // -----> 2

	public void launchBrowser() {

		System.out.println("2. launch Chrome Browser");

	}

	@BeforeClass   // -----> 3

	public void login() {

		System.out.println("3. login to app");

	}



	@BeforeMethod // -----> 4

	public void enterURL() {

		System.out.println("4. enterURL");

	}



	
	//test case 
	@Test                   // -----> 5

	public void googletitleTest() {

		System.out.println("5. google title Test");

	}
	
	
	
	//test case 
		@Test                   // -----> 5a

		public void facebooktitleTest() {

			System.out.println("5a. facebook title Test");

		}


	//post conditions
	
	@AfterMethod           // -----> 6

	public void logout() {

		System.out.println("6. log out from application");

	}

	
	@AfterClass           // -----> 7

	public void closehBrowser() {

		System.out.println("7. Close Browser");

	}
	
	

	@AfterTest      // -----> 8

	public void deleteAllCookies() {

		System.out.println("8. delete All Cookies");

	}    



	




	/*@AfterSuite      // -----> 9

	public void generateTestReport() {

		System.out.println("9. generate Test Report");

	}
*/


}
