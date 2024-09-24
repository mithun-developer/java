package com.dtd;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvanceSearch extends Base{
	
	public static void advSearch() throws InterruptedException {
		
		WebElement dds = driver.findElement((OR.dd));
		Select s = new Select(dds);
		s.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement((OR.search)).click();
		Thread.sleep(2000);
		driver.findElement((OR.refine)).click();
		
		driver.findElement((OR.amt)).sendKeys("0.01");
		driver.findElement((OR.amnt)).sendKeys("0.01");
		
		driver.findElement((OR.search)).click();
		
	List <WebElement>li = driver.findElements((OR.radio));
	li.get(li.size()-1).click();
	
	driver.findElement((OR.view)).click();
	r.keyPress(KeyEvent.VK_PRINTSCREEN);
	r.keyRelease(KeyEvent.VK_PRINTSCREEN);
	
	r.keyPress(KeyEvent.VK_WINDOWS);
	r.keyRelease(KeyEvent.VK_WINDOWS);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_P);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	Thread.sleep(3000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	
	Thread.sleep(3000);
	
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
	Thread.sleep(3000);
	driver.findElement((OR.exit)).click();
	
	driver.findElement((OR.close)).click();
	
	driver.switchTo().window(windowe.get(0));
	
	
	driver.findElement((OR.soff)).click();
	
		
	}
		
	}


