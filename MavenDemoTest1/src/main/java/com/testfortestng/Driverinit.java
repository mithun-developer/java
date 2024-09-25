package com.testfortestng;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverinit {
	
	private static Driverinit dv = null;
	private WebDriver driver;
	
	private Driverinit() {
		
	}
	
	
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\MavenDemoTest1\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		return driver;
	}
	
	
	public static Driverinit getInstance() {
		
		if(dv == null);
		
		dv= new Driverinit();
		
		return dv;
	}

	
	

}
