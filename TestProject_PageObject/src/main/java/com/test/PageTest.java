package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		Driverinit instanceDriver = 	Driverinit.getInstance();
		driver = instanceDriver.launchBrowser();
	}
	
	@Test
	public void test1() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}

}
