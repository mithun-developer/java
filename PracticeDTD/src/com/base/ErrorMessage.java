package com.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ErrorMessage extends Base{
	
	public static void loginPage() throws InterruptedException {
	WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
	coid.sendKeys("wqadtdm4");
	

	WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));
	js.executeScript("arguments[0].style.border='3px solid blue';", userid);
	userid.sendKeys("wqamith");

	WebElement pw= driver.findElement(By.xpath("//*[@id='passwordIdField']"));
	pw.sendKeys("hitech@14");

	WebElement signOn = driver.findElement(By.xpath("//*[@id='ceopLoginButton']"));
	js.executeScript("arguments[0].click();", signOn);
	signOn.click();

	ArrayList<String>window = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(window.get(1));
	driver.manage().window().maximize();

	List<WebElement> li  = driver.findElements(By.xpath("(//table)[4]//td[2]"));
	for(int i=0;i<li.size();i++) {
		WebElement radiobtn = li.get(i-1);
		radiobtn.click();
		driver.findElement(By.xpath("//a[text()='View Deposit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Select All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Review Items']")).click();
		Thread.sleep(3000);
		
	}
	}
}