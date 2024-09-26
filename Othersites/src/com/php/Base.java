package com.php;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	
	public static void main(String args[]) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\Othersites\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		HomePage.openSite();
		
		SearchFlights.flights();
		
	}
}
