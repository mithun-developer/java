package com.php;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends Base{

	
	public static void openSite() {
		
		
		driver.get("https://www.phptravels.net/m-flights");
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		
	}
}
