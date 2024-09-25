package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.Xls_Reader;

public class DataDriven {
	
     
	
	public static void main(String args[]) {
		WebDriver driver;

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
		
		
		
		 
          	Xls_Reader reader = new Xls_Reader("C:\\Users\\Mithun\\Desktop\\testdata.xlsx");
          	int rowcount = reader.getRowCount("Sheet1");
          	
         reader.addColumn("Sheet1", "Status");
         
        
          	
          	for(int rownum=2;rownum<=rowcount;rownum++) {
          		
          		String fullname =reader.getCellData("Sheet1", "fullname", rownum);
    			System.out.println(fullname);
    			
    			String email =reader.getCellData("Sheet1", "email", rownum);
    			System.out.println(email);
    			
    			String currentaddress =reader.getCellData("Sheet1", "currentaddress", rownum);
    			System.out.println(currentaddress);
    			
    			String permenantaddress =reader.getCellData("Sheet1", "permenantaddress", rownum);
    			System.out.println(permenantaddress);
    			
    			
    			 driver.findElement(By.xpath("//*[@id='userName']")).clear();
 				 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(fullname);
 				
 				
 				 driver.findElement(By.xpath("//*[@id='userEmail']")).clear();
 				 driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys(email);
 				 
 				 
 				driver.findElement(By.xpath("//*[@class='form-control']")).clear();
 				 driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(currentaddress);
 				 
 				
 				driver.findElement(By.xpath("//*[@id='permanentAddress']")).clear();
 				 driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys(permenantaddress);
 				 
 				 reader.setCellData("Sheet1", "Status", rownum, "pass");
   		
          	}
			
			
			
				
		}
		
		
		
		
	}


