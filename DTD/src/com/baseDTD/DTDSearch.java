package com.baseDTD;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;


public class DTDSearch {
	public static WebElement depAccountSearch;
	
	@Test
	public static void sear() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");
		
		WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
		coid.sendKeys("wqadtdm4");
WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));
userid.sendKeys("wqamith");
WebElement pw = driver.findElement(By.xpath("//*[@id='passwordIdField']"));
pw.sendKeys("hitech@14");

WebElement signOn = driver.findElement(By.xpath("//*[@id='ceopLoginButton'] "));
signOn.click();

WebElement dtd = driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
dtd.click();

Thread.sleep(15000);

ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(windows.get(1));



	
	
	WebElement search = driver.findElement(By.xpath("//*[@name='searchValue']"));
	search.sendKeys("0.01");
	WebElement searchh = driver.findElement(By.xpath("//*[@class='dtdRedButton']"));
	searchh.click();
	
	By dropDown = By.xpath("//*[@id='simpleSearchAction_searchType']");
	depAccountSearch = driver.findElement(dropDown);	
	Select s = new Select(depAccountSearch);
	s.selectByIndex(1);
	Thread.sleep(5000);
	WebElement depAcc = driver.findElement(By.xpath("//*[@name='searchValue']"));
	depAcc.clear();
	depAcc.sendKeys("4121080725");
	WebElement searchhi = driver.findElement(By.xpath("//*[@class='dtdRedButton']"));
	searchhi.click();
	
	depAccountSearch = driver.findElement(dropDown);
	Select se = new Select(depAccountSearch);
	se.selectByIndex(2);
	Thread.sleep(2000);
	depAcc.clear();
	depAcc.sendKeys("121000248");
	WebElement searchhii = driver.findElement(By.xpath("//*[@class='dtdRedButton']"));
	searchhii.click();
	
		
	}

}
