package com.flipkart;

import java.awt.MouseInfo;
import java.awt.PointerInfo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions a;
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\Othersites\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		js= (JavascriptExecutor) driver;
		a= new Actions(driver);
		
		driver.get("https://www.flipkart.com");
		HomePage.login();
		PointerInfo pi = MouseInfo.getPointerInfo();
		Thread.sleep(8000);
		System.out.println(pi.getLocation().getX());
		System.out.println(pi.getLocation().getY());
		//11ef81a
		
		
		
	
	}

}
