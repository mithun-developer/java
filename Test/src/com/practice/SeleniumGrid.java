package com.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	
	//static WebDriver driver;
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\Desktop\\eclipse\\Gridjar\\chromedriver.exe");
		WebDriver	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
		
		driver.get("https://www.google.com/");
		
	}

}
