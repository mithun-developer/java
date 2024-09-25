package com.testfortestng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\TestProject_PageObject\\newBrowser\\chromedriver.exe");
	
		driver = new ChromeDriver();
	
		//	driver.get("https://www.google.com/");
			driver.navigate().to("https://www.google.com/");
			
			WebElement mail = driver.findElement(By.xpath("//a[text()='Gmail']"));
			
			mail.sendKeys(Keys.CONTROL,"a");
			
			
			
	}
			
	

	
	
	public static void wait(WebDriver driver,WebElement mail,int time) {
		
		 new  WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(mail));
		
		mail.click();
	}
	
	
	
	
	@Test(priority=1,groups="title")
	
	public void googleTitleTest() {
		
	String str = 	driver.getTitle();
		Assert.assertEquals(str, "Google");
		
		
	}
	
	
       @Test(priority=2,groups="mail")
	
	public void googleMailLinkTest() {
		
	 	boolean b = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		
	}
	
       
       
       @Test (priority=3,groups="test")
   	
   	public void test1() {
   		
   	 	System.out.println("Test1");
   		
   	}
       
       @Test(priority=4,groups="test")
      	
      	public void test2() {
      		
      	 	System.out.println("Test2");
      		
      	}
       
       
       @Test(priority=5,groups="test")
      	
      	public void test3() {
      		
      	 	System.out.println("Test3");
      		
      	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
	}

}
