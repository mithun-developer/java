package com.testandquiz_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample_WebPage {
	
	
	public static WebDriver driver;
	
	
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\Othersites\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		//driver.findElement(By.linkText("This is a link")).click();
		driver.findElement(By.xpath("//a[text()='This is a link']")).click();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Mithun");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='idOfButton']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='male']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='Automation']")).click();
		
		driver.findElement(By.xpath("//*[@class='Performance']")).click();
		Thread.sleep(3000);
		
		
		WebElement dd = driver.findElement(By.xpath("//*[@id='testingDropdown']"));
		Select s = new Select(dd);
		s.selectByIndex(3);
		
		Thread.sleep(3000);
	
		
		WebElement cc = driver.findElement(By.xpath("//*[@id='dblClkBtn']"));
		Actions a = new Actions(driver);
		a.doubleClick(cc).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		WebElement src = driver.findElement(By.xpath("//*[@id='sourceImage']"));
		WebElement tgt = driver.findElement(By.xpath("//*[@id='targetDiv']"));
		
		Actions aa = new Actions(driver);
		aa.dragAndDrop(src, tgt).build().perform();;
		
		
		
	}

}
