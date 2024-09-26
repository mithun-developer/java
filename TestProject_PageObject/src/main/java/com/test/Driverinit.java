package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverinit {
	
	private static Driverinit instanceDriver =null;
	private WebDriver driver;
	
	
	private Driverinit() {

		
	}
	

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\TestProject_PageObject\\Browser\\chromedriver.exe");
		driver=new ChromeDriver();
	
		return driver;
	}
	
	
	public static Driverinit getInstance() {
		if(instanceDriver==null) {
			instanceDriver = new Driverinit();
		}
			return instanceDriver;

	}
	
	
}
