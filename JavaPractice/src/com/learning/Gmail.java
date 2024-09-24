package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Gmail {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\PracticeDTD\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='whsOnd zHQkBf'])[1]")).sendKeys("mithun.modali@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("subhasri1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
		Thread.sleep(15000);
		
	WebElement cl = 	driver.findElement(By.xpath("(//*[@class='G-asx T-I-J3 J-J5-Ji'])[2]"));
		cl.click();
		//driver.findElement(By.xpath("//*[@class='T-Jo J-J5-Ji']")).click();
		
		//Actions a = new Actions(driver);
	Select s = new Select(cl);
	s.selectByIndex(3);
	
	
	
		
		
	}
}
