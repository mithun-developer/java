package com.parameters;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.analyzer.Retry;

import com.util.TestUtil;

public class EbayTest {
	
	static WebDriver driver;
	
	SoftAssert softAssert = new SoftAssert();
	
	
	
	 @BeforeMethod
	 public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/text-box");
			
	 }
	 
	 
	 @DataProvider
	 public Iterator getTestdata() {
		 ArrayList<Object[]> mydata= TestUtil.getData();
		 return mydata.iterator();
	 }
	 
	
	
	 
	
	 
	 @Test(dataProvider="getTestdata",expectedExceptions=ArrayIndexOutOfBoundsException.class,retryAnalyzer=Retry.class)
	 public void toolsReg(String fullname,String email, String currentaddress, String permenantaddress) throws IOException, InterruptedException {
		 driver.findElement(By.xpath("//*[@class='mr-sm-2 form-control']")).clear();
		 driver.findElement(By.xpath("//*[@class='mr-sm-2 form-control']")).sendKeys(fullname);
		 
		 
		 driver.findElement(By.xpath("//*[@id='userEmail']")).clear();
		 driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys(email);
		 
		
		 
		 driver.findElement(By.xpath("//*[@class='form-control']")).clear();
		 driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(currentaddress);
		 
		 driver.findElement(By.xpath("//*[@id='permanentAddress']")).clear();
	
		
		 softAssert.assertAll(); //
		
		 driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys(permenantaddress);
		
		 
		 
		 Actions a = new Actions(driver);
		
		 
		 
		
		
		throw new SkipException("not ready");
		

	 }
	 
	 public static void screenshots(String name) {
		 TakesScreenshot ts =  (TakesScreenshot) driver;
		 File f = ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(f, new File("E:\\New Technologies\\SELENIUM\\captured screenshots"+name+"_"+".jpg"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 }
	 
		
	public static void sk(WebDriver driver,WebElement element,int timeout,String val) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(val);
		
	}

	
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }


	
		
	}

