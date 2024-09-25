package com.baseDTD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils  {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");	
	}
	
	public static void sendValues(String xpath, String value){
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(value);
		
	}
	
	public static void klick(String xpath) throws InterruptedException {
		Thread.sleep(3000);
		WebElement elementClic = driver.findElement(By.xpath(xpath));
		elementClic.click();
		
	}
}


