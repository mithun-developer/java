package com.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public static WebDriver driver;
	
	
	
	public static void launchBrowser() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\MavenDemoTest1\\Browser\\chromedriver.exe");
			
			driver = new ChromeDriver();
		
			
			driver.get("https://google.com");

		
		}
	
	
	
	
	public void failed(String methodName) throws IOException {
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\SELENIUM\\captured screenshots\\"+methodName+"_"+".jpg"));
		
	}
	}

