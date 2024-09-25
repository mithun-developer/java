package com.parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"env","browser","url","emailid"})
	public void login(String browser,String url, String emailid) throws InterruptedException {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\geckodriver.exe");
			
			driver= new FirefoxDriver();
			
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
			
		
		}
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@name='signin']")).click();
		
		
	}

}
