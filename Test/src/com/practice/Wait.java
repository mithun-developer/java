package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\Test\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement user = driver.findElement(By.xpath("//*[@name='email']"));
		
		WebElement pwd = driver.findElement(By.xpath("//*[@name='email']"));
		
		WebElement login = driver.findElement(By.xpath("//*[@name='login']"));
	
		
	
		user.sendKeys("Mithun");
		
		pwd.sendKeys("mithun");
		
		
		timeToWait(driver,login,30);
		
	
	}
	
	
	
	public static void timeToWait(WebDriver driver, WebElement login,int timeout) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		
	}
	
	
	
	
	
	
}
