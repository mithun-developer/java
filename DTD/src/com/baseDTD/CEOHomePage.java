package com.baseDTD;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class CEOHomePage {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");



int day,month,year;
GregorianCalendar date= new GregorianCalendar();



month=date.get(Calendar.MONTH);

day=date.get(Calendar.DATE);
year=date.get(Calendar.YEAR);
System.out.println(month+"/"+day+"/"+year);
		
		

		
	}
	
}
