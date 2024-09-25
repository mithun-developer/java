package com.baseDTD;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvSearch {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Select s ;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;



		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);


		WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));

		coid.sendKeys("wqadtdm4");
		WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));


		js.executeScript("arguments[0].style.border='3px solid blue';", userid);


		userid.sendKeys("wqamith");
		WebElement pw= driver.findElement(By.xpath("//*[@id='passwordIdField'] "));
		pw.sendKeys("hitech@14");
		WebElement signOn = driver.findElement(By.xpath("//*[@id='ceopLoginButton']"));
		js.executeScript("arguments[0].click();", signOn);
		signOn.click();
Thread.sleep(10000);
		WebElement dtd = driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
		dtd.click();
		
		
		

		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(1));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='Advanced Search']")).click();
		Thread.sleep(3000);
		WebElement dd = driver.findElement(By.xpath("//*[@name='depositAccountRtn']"));
		 s = new Select(dd);
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		
		WebElement depstat = driver.findElement(By.xpath("//*[@name='depositStatus']"));
		s = new Select(depstat);
		s.selectByIndex(5);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='defaultKey']")).click();


	}

}
