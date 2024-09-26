package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	js=(JavascriptExecutor) driver;

	driver.get("https://wellsoffice.wellsfargo.com/portal/signon");
	
	

	}
	
public static boolean isMessageDisplayed() {
	 boolean status =true;
	 try {
		 if(driver.findElement(By.xpath("//a[text()='Re-Scan']")).isDisplayed()) {
			 
		 }
	 }catch(Exception e) {
		 status =false;
	 }

	 return status;	
		
	}

}
