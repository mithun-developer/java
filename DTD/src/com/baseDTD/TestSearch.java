package com.baseDTD;

import java.util.ArrayList;
import java.util.PriorityQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSearch {
	public static WebElement txt;
	public static WebDriver driver;
	public static WebElement  userid;
	
	
	
	public static boolean errorMessageIsDisplayed() {
		boolean status = true;
		try {
			if(userid.isDisplayed()) {
				userid.click();
			}
			
		}catch(Exception e) {
			status=false;
		}
		
		return status;
	}
	

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");
		WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
		coid.sendKeys("wqadtdm4");
WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));
userid.sendKeys("wqamith");
WebElement pw = driver.findElement(By.xpath("//*[@id='passwordIdField']"));
pw.sendKeys("hitech@17");

WebElement signOn = driver.findElement(By.xpath("//*[@id='ceopLoginButton'] "));
signOn.click();
Thread.sleep(10000);

WebElement dtd = driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
dtd.click();



Thread.sleep(20000);

ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(window.get(1));
driver.manage().window().maximize();
Thread.sleep(2000);

 driver.findElement(By.xpath("(//*[@name='radioButton'])[1]")).click();
 driver.findElement(By.xpath("//*[@title='View Deposit']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//a[text()='Select All']")).click();
 driver.findElement(By.xpath("//*[@title='Review Items']")).click();
 Thread.sleep(4000);

 try {
	
	 while(driver.findElement(By.xpath("//*[@title='Next Check']")).isDisplayed()){
		 if(driver.findElement(By.xpath("//a[@title='Skip Item']")).isDisplayed()) {
			 driver.findElement(By.xpath("//a[@title='Delete']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='checkBox1']")).click();
			 driver.findElement(By.xpath("//*[@id='defaultKey']")).click();
		 
		 
	 }
		 if(driver.findElement(By.xpath("//a[@title='Skip Item']")).isDisplayed()) {
			 driver.findElement(By.xpath("//a[@title='Delete']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='checkBox1']")).click();
			 driver.findElement(By.xpath("//*[@id='defaultKey']")).click();
		 }
		 
		 if(driver.findElement(By.xpath("//*[@title='Next Check']")).isDisplayed()) {
			 String val = driver.findElement(By.xpath("//*[@id='formattedCheckAmount']")).getAttribute("value");
			 if(val.isEmpty()) {
				 driver.findElement(By.xpath("//*[@id='formattedCheckAmount']")).sendKeys("0.01");
				 driver.findElement(By.xpath("//*[@title='Next Check']")).click();
			 }else {
				 driver.findElement(By.xpath("//*[@title='Next Check']")).click();
			 }
			 
			 
		 }
		 
		 if(driver.findElement(By.xpath("//*[@title='Save Check']")).isDisplayed()){
			 String val = driver.findElement(By.xpath("//*[@id='formattedCheckAmount']")).getAttribute("value");
			 if(val.isEmpty()) {
				 driver.findElement(By.xpath("//*[@id='formattedCheckAmount']")).sendKeys("0.01");
				 driver.findElement(By.xpath("//*[@title='Save Check']")).click();
				 
			 }
			 
		 }
		 
		 
 }
 
	 
 }catch(Exception E) {
	 
 }
	

		
	}

}
