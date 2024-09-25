package com.baseDTD;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DTDReportes {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	js = (JavascriptExecutor) driver;
	driver.get("https://wellsoffice.ceo.wellsfargo.com");
	
	WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",coid);
	coid.sendKeys("wqadtdm4");
	
	
	WebElement  uid = driver.findElement(By.xpath("//*[@id='user_id']"));
	js.executeScript("arguments[0].style.border = '3px dashed blue';",uid);
	uid.sendKeys("wqamith");
	
	WebElement pw = driver.findElement(By.xpath("//*[@id='passwordIdField']"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",pw);
	pw.sendKeys("hitech@18");
	
	WebElement signon = driver.findElement(By.xpath("//*[@id='ceopLoginButton']"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",signon);
	signon.click();
	
	Thread.sleep(15000);
	
	WebElement dtd= driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",dtd);
	dtd.click();
	
	
	
	ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(window.get(1));
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	WebElement reports = driver.findElement(By.xpath("//*[text()='Create Reports']"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",reports);
	reports.click();
	
	
	WebElement depacc = driver.findElement(By.xpath("//*[@id='accountNumberSelect']"));
	WebElement acc = driver.findElement(By.xpath("//*[text()='4121080725(121000248-#&#&#&#&#&#&689#&#&#)']"));
	/*js.executeScript("arguments[0].style.border='3px dashed blue';",depacc);
	Select s = new Select(depacc);
	s.selectByIndex(1);
	Thread.sleep(6000);*/
	Actions a = new Actions(driver);
	a.click(acc).build().perform();
	
	
	WebElement depstatus = driver.findElement(By.xpath("//*[@id='depositStatus']"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",depstatus);
	
	Select ss = new Select(depstatus);
	ss.selectByIndex(5);
	
	WebElement radio = driver.findElement(By.xpath("//*[@id='radio2']"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",radio);
	radio.click();
	
	Thread.sleep(4000);
	
	WebElement report = driver.findElement(By.xpath("(//*[text()='Create Report'])[3]"));
	js.executeScript("arguments[0].style.border='3px dashed blue';",report);
	report.click();
	
	
	
	
	
}
	}


