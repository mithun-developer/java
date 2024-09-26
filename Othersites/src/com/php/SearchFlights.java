package com.php;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchFlights extends Base {
	
	public static void flights() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath("(//*[@class='hidden-xs'])[3]")).click();
		Thread.sleep(6000);
		
	WebElement loc = driver.findElement(By.xpath("(//*[@class='select2-choice select2-default'])[2]"));
	
	Actions a = new Actions(driver);
	a.click(loc).sendKeys("hyd").build().perform();
	
		Robot r = new Robot();
		Thread.sleep(6000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement locs = driver.findElement(By.xpath("(//*[@class='select2-choice select2-default'])[2]"));
		Actions aa = new Actions(driver);
		aa.click(locs).sendKeys("del").build().perform();
		Thread.sleep(3000);
		Robot rr = new Robot();
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@type='text'])[25]")).sendKeys("2019-01-15");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='btn-primary btn btn-lg btn-block pfb0']")).click();
		Thread.sleep(5000);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);
		WebElement sb = driver.findElement(By.xpath("(//*[@class='pagination']//child::*)[6]"));
		js.executeScript("arguments[0].scrollIntoView();",sb);
		sb.click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		
		
	}

}
