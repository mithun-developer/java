package com.test;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class AirindiaTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\MavenDemoTest1\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://ffai.loyaltyplus.aero/ailoyalty/register.jsf");
	
	}
	
	
	
	 @DataProvider
	 public Iterator <Object[]> getTestData() {
		ArrayList<Object[]> data =  Utilities.getData();
		
		 return data.iterator();
	 }
	 
	 
	
	 @Test(dataProvider="getTestData")
	 public void RegPage(String firstname,String lastname,String noc,String dob,String maidenname) {
		 
		 
		 //first name
		 driver.findElement(By.xpath("//*[@id='register_form:profile:firstName']")).clear();
		 driver.findElement(By.xpath("//*[@id='register_form:profile:firstName']")).sendKeys(firstname);
		 
		 //last name
		 driver.findElement(By.xpath("//*[@id='register_form:profile:lastName']")).clear();
		 driver.findElement(By.xpath("//*[@id='register_form:profile:lastName']")).sendKeys(lastname);
		 
		 //Date of birth
		 
		 driver.findElement(By.xpath("//*[@id='register_form:profile:dateOfBirth_input']")).clear();
		 driver.findElement(By.xpath("//*[@id='register_form:profile:dateOfBirth_input']")).sendKeys(dob);
		 
		 
		 //name On card
		 
		 driver.findElement(By.xpath("//*[@id='register_form:profile:nameOnCard']")).clear();
		 driver.findElement(By.xpath("//*[@id='register_form:profile:nameOnCard']")).sendKeys(noc);
		 
		 
		 //Mothers maiden name
		 
		 driver.findElement(By.xpath("//*[@id='//*[@id='register_form:profile:mothersName']']")).clear();
		 driver.findElement(By.xpath("//*[@id='//*[@id='register_form:profile:mothersName']']")).sendKeys(maidenname);
		 
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
