package com.baseDTD;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DtdReportsWithItemDetails {
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		
		driver.get("https://wellsoffice.wellsfargo.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
				coid.sendKeys("WQADTDM4");
				js.executeScript("arguments[0].style.border = '3px dashed blue';",coid);
				
				WebElement uid = driver.findElement(By.xpath("//*[@id='user_id']"));
				uid.sendKeys("WQAMITH");
				js.executeScript("arguments[0].style.border = '3px dashed blue';",uid);
				
				WebElement pw = driver.findElement(By.xpath("//*[@id='passwordIdField']"));
				pw.sendKeys("hitech@13");
				js.executeScript("arguments[0].style.border = '3px dashed blue';",pw);
				
				WebElement sign = driver.findElement(By.xpath("//*[@id='ceopLoginButton']"));
				js.executeScript("arguments[0].click();",sign);
				Thread.sleep(2000);
				
				WebElement dtd = driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
				js.executeScript("arguments[0].style.border = '4px dashed blue';",dtd);
				js.executeScript("arguments[0].click();",dtd);
				
				ArrayList<String> window =new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(window.get(1));
				Thread.sleep(10000);
				driver.manage().window().maximize();
				WebElement ul = driver.findElement(By.xpath("(//*[@class='splash_text'])[7]"));
				js.executeScript("arguments[0].style.border = '3px dashed blue';",ul);
				js.executeScript("arguments[0].click();",ul);
				
				
				
	}

}
