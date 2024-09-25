package com.baseDTD;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class DtdAdvanceSearch extends Utils{
	
	//public static WebDriver driver;
	//public static JavascriptExecutor js;

	public static void main(String args[]) throws InterruptedException {
		
	launchBrowser();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	sendValues("//*[@id='comp_id']", "wqadtdm4");
	sendValues("//*[@id='user_id']", "wqamith");
	sendValues("//*[@id='passwordIdField']", "hitech@13");
	
	klick("//*[@id='ceopLoginButton']");
	Thread.sleep(5000);
	klick("//*[@class='wf2ceop-appLink']");
	
	ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windows.get(1));
	driver.manage().window().maximize();
	Thread.sleep(6000);
	klick("//*[@cssclass='smallertext ']");
	WebElement dd = driver.findElement(By.xpath("//*[@name='depositAccountRtn']"));
	Select s = new Select(dd);
	s.selectByIndex(1);
	klick("//*[@id='defaultKey']");
	
	WebElement tex = driver.findElement(By.xpath("//*[@class='dd_lightgrey smaller']"));
	System.out.println(tex.getText().substring(17, 27));
	tex.getText().substring(17,27);
	
	
	List<WebElement> li = driver.findElements(By.xpath("//*[@class='supersized_025']/parent::*/following-sibling::*[1]"));
	for(int i =0;i<li.size();i++) {
		String str = li.get(i).getText();
		if(tex.getText().substring(17,27).contains("4121080725")) {
			System.out.println("Correct");
		}else {
			System.out.println("Incorrect");
		}
	}
	
	
	

	}
}
