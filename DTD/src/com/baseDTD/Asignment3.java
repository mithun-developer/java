package com.baseDTD;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment3 {

	public static WebDriver driver;
	public static JavascriptExecutor js;

		public static void main(String args[]) throws InterruptedException, AWTException {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			js = (JavascriptExecutor) driver;
			driver.get("https://material.angular.io/cdk/scrolling/overview");
			driver.manage().window().maximize();
		WebElement ele = 	driver.findElement(By.xpath("(//*[@class='example-viewport cdk-virtual-scroll-viewport cdk-virtual-scroll-orientation-vertical'])[1]"));
			js.executeScript("arguments[0].scrollIntoView();",ele);
			Thread.sleep(8000);
			Robot r = new Robot();
		//	Point p = MouseInfo.getPointerInfo().getLocation();
			//System.out.println(p);
			
			r.mouseMove(506, 344);
			while(true) {
				r.mouseWheel(50);
				Thread.sleep(1000);
				try {
					if(driver.findElement(By.xpath("//div[text()='Item #350']")).isDisplayed()){
						System.out.println("Displayed");
					
					}
				}catch(Exception e) {
					
				}
				
			}
			
			
		}
		
	}

