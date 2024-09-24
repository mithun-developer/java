package com.dtd;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Robot r;
	public static ArrayList<String>windowe;
	
	
	public static void main(String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DESKTOPDEPOSIT\\Browsers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		js=(JavascriptExecutor) driver;
		r= new Robot();
		
		
		driver.get("https://wellsoffice.wellsfargo.com");
		
		CeoPortal.loginPage();
		
	windowe	= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowe.get(1));
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		PendingDepositPage.pendingDep();
		
		AdvanceSearch.advSearch();
		driver.close();
		
		
		
		
	}

}
