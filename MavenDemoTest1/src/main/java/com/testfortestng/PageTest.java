package com.testfortestng;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		Driverinit init=	Driverinit.getInstance();
		driver=init.openBrowser();
		
	}
	
	@Test
	public void testMethod1() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
	
	
	@ AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
