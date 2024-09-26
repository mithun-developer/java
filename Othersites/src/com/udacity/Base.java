package com.udacity;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	public static WebDriver driver;
	public static JavascriptExecutor js; 
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\Othersites\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		
		driver.get("https://in.udacity.com/nanodegree");
		//WebElement abc = driver.findElement(By.xpath("(//a[text()='View Details'])[3]"));
		
		Thread.sleep(8000);
		//WebElement us = driver.findElement(By.xpath("//*[@class='intercom-borderless-dismiss-button']"));
	//	js.executeScript("arguments[0].click();",us);
		//WebElement ele = driver.findElement(By.xpath("//*[@class='intercom-borderless-frame']"));
		WebElement msg = driver.findElement(By.xpath("//*[@class='contain intro']"));
		ArrayList<String> frame = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().frame(frame.get(1));
		Actions a =new Actions(driver);
		a.click(msg).build().perform();
		
		
		/*
		driver.findElement(By.xpath("//div[@class='new-conversation-button-contents']")).click();
		driver.findElement(By.xpath("//div[@class='css-d5n6ly e1oluflk0']")).click();*/
		
		///driver.switchTo().frame(ele);
		///Actions a  = new Actions(driver);
		Thread.sleep(3000);

		///driver.findElement(By.xpath("//*[@class='intercom-block intercom-block-paragraph']")).click();
		
///WebElement btn = driver.findElement(By.xpath("//*[@class='intercom-borderless-dismiss-button']"));
///a.click(btn).build().perform();
		

//driver.findElement(By.xpath("//*[@class='intercom-chat-card intercom-chat-card-borderless intercom-chat-card-with-avatar']")).click();
//Thread.sleep(2000);


		
	}

}
