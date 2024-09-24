package com.learning5;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Wait {
	
	protected FluentWait<WebDriver> wait;
	
	public static WebDriver driver;
	WebElement element;
	
	/*public static void main(String[] args)  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	}
*/
	public Wait() {
		
		super();
		this.getInitializeFluentWait();
		
	}

	private void getInitializeFluentWait() {
	
		new WebDriverWait(driver,30).pollingEvery(Duration.ofSeconds(1));
		
	}
	
	
	private void getUntilMessageDisappears() {
		new WebDriverWait(driver,30).pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	FluentWait waits = new FluentWait (driver)
			.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			
	
	
}
