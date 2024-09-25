package com.testfortestng;

import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mithun\\eclipse-workspace\\MavenDemoTest1\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us&guccounter=1");
		
		
		// For Each
		//*************

		/*for (WebElement ele : driver.findElements(By.xpath("//*[@id='ybar-navigation']//a"))) {
			System.out.println(ele.getText()+":  "+ele.getAttribute("href"));
	
		}*/
		
		ArrayList<WebElement> al = new ArrayList();
		al = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id='ybar-navigation']//a"));
		
		List<WebElement> list =driver.findElements(By.xpath("//*[@id='ybar-navigation']//a"));
		int aa  =list.size();
		System.out.println(aa+" "+"links");
		
		
		//Using For Loop
		//*******************
		
		
		/*al = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id='ybar-navigation']//a"));
		
		for(int i=0;i<al.size();i++) {
			String str = al.get(i).getAttribute("href");
			System.out.println(str);
			
			
		}*/
		
		
		//using Iterator
    	//******************
		
	/*	Iterator<WebElement> itr = al.iterator();
		
		while(itr.hasNext()) {
			WebElement ele = itr.next();
			String str =ele.getAttribute("href");
			System.out.println(str);
			
		}*/
	
		
		
		
		//using ListIterator
    	//******************
		
		/*ListIterator<WebElement> li = al.listIterator();
		
		while(li.hasNext()) {
			WebElement ele = li.next();
			String str = ele.getAttribute("href");
			System.out.println(str);
		}
		*/
			
		
		//using forEachRemaining
    	//******************
		
		/*Iterator<WebElement> itr = al.iterator();
		itr.forEachRemaining(a->{
			String str = a.getAttribute("href");
			
			System.out.println(str);
		});
		*/
		
		
		
		//using forEach
    	//******************
		
		Iterator itr = al.iterator();
		al.forEach(a->{
			String str = a.getAttribute("href");
			System.out.println(str);

			
		});
		
			
			
		}
		
		
		
	}

