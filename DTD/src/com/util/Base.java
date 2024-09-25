package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver ;
	
          public static void initialisation() {
        	  
        	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
        	  driver = new ChromeDriver();
        	  driver.get("https://www.google.com/");
          }
	
	public void failed(String name)  {
		
		TakesScreenshot ts =   (TakesScreenshot) driver;
		File src=  ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("E:\\New Technologies\\SELENIUM\\"+name+"_"+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
