package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	WebDriver driver;
	
	@Test
	@Parameters({"url","browser","emailid"})
	public void login(String url, String browser, String emailid) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(emailid);
		
	}

}
