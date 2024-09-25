package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	
	@Test(priority=2,groups="Title",expectedExceptions=NumberFormatException.class)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups="Logo")
	
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		throw new SkipException("no");
	}
	
	
	@Test(priority=1,groups="Link")
	public void gmailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	@Test(priority=4,groups="only test")
	public void test1() {
		System.out.println("test1");
		
	}
	
	
	@Test(priority=5,groups="only test")
	public void test2() {
		System.out.println("test2");
		
	}
	
	@Test(priority=6,groups="only test")
	public void test3() {
		System.out.println("test3");
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}

}
