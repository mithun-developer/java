package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParamenetrTest {
	
	
	WebDriver driver;
	
	@ Test
	@ Parameters({"browser","url","username"})
	
	public void yahoologin(String browser, String url, String username) {
		
		if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\MavenDemoTest1\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		} else if(browser.equals("firefox")) {
			System.out.println("no firefox setup");
		}
		
			driver.get(url);
			
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
			
			driver.findElement(By.xpath("//*[@name='signin']")).click();
			
			
	}

}
