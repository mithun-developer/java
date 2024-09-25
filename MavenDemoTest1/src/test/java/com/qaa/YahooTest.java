package com.qaa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.*;

import junit.framework.Assert;

public class YahooTest {
	
	WebDriver  driver;

	
	@BeforeMethod
	
	public void login() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\MavenDemoTest1\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us&guccounter=1");
		
		
			
	
	}
	
	
	
	@ Test
	
	public void logo() {
		
		for(WebElement ele : driver.findElements(By.xpath("//*[@id='ybar-navigation']//a"))) {
			System.out.println(ele.getAttribute("href"));
			
			System.out.println(ele.getText());
			
			
			
		
		}
		
		/*boolean logo = driver.findElement(By.xpath("//*[@id='ybar-logo']")).isDisplayed();
		Assert.assertTrue(logo);*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
