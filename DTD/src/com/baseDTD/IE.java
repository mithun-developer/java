package com.baseDTD;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
 driver = new ChromeDriver();
js=(JavascriptExecutor) driver;

driver.get("https://wellsoffice.wellsfargo.com/portal/signon");

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
