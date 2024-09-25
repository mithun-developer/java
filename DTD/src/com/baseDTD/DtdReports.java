package com.baseDTD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DtdReports {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement COID = driver.findElement(By.xpath("//*[@id='comp_id']"));
		COID.sendKeys("WQADTDM4");
		WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));
		userid.sendKeys("wqamith");
		WebElement password =driver.findElement(By.xpath("//*[@id='passwordIdField']"));
		password.sendKeys("hitech@13");
		WebElement signon = driver.findElement(By.xpath("//*[@id='ceopLoginButton']"));
		signon.click();
		WebElement desktop = driver.findElement(By.xpath("//*[@data-appid='wfappdsktpdp']"));
		desktop.click();
		Thread.sleep(10000);
		/*ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(1));
		*/
		
		ArrayList<String> window = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(1));
		
		
		
		driver.findElement(By.xpath("(//*[@class='splash_text'])[7]")).click();
		WebElement reports = driver.findElement(By.xpath("//*[text()='Create Reports']"));
		reports.click();
		
		//WebElement depname = driver.findElement(By.xpath("//*[@name='depositName']"));
		
		//depname.sendKeys("production support");
		
		WebElement depstatus = driver.findElement(By.xpath("//*[@name='depositStatus']"));
		Select s = new Select(depstatus);
		s.selectByIndex(5);
		Thread.sleep(3000);
		WebElement createreport =	driver.findElement(By.xpath("//a[@id='defaultKey']"));
		createreport.click();
		
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(windows.get(2));
		
		WebElement username= driver.findElement(By.xpath("//*[@class='tablereportheader']//strong[contains(text(),'User Name:')]/parent::td"));
		String stri = username.getText();
		if (stri.contains("Mithun Modali")) {
			System.out.println("User name is correct");
		}else {
			System.out.println("invalid username");
		}
			WebElement depname = driver.findElement(By.xpath("(//*[@class='depositinfo']//strong)[2]"));
			String sttr = depname.getText();
			
			if (sttr.contains("Production Support")) {
				System.out.println("Deposit name is correct");
			}else {
				System.out.println("deposit name is not correct");
			}
		
	
			WebElement name=driver.findElement(By.xpath("(//*[@class='reportContentContainer']//td[contains(text(),'Deposited By:')]/following-sibling::*)[1]"));
			String depositedBy = name.getText();
			if (depositedBy.equalsIgnoreCase("mithun modali")) {
				System.out.println("Perfect");
			}else {
				System.out.println("Not correct");
			}
	
	
WebElement depAmount =	driver.findElement(By.xpath("(//*[@class='depositinfo']//td[contains(text(),'Deposit Amount:')]/child::*)[1]"));
String value = depAmount.getText();

	if(value.equals("$ 0.01")) {
		System.out.println("Deposit amount is correct");
		
	}else {
		System.out.println("Please check the deposit amount");
	}
	
WebElement bagnumber =driver.findElement(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Bag Number:')]/following-sibling::td"));
String bag = bagnumber.getText();
if(bag.contains("-")) {
	System.out.println("No Bag Number");
}else {
	System.out.println("There is a bag number. Its failed!!!");
	
}
	System.out.println("All confirmantion numbers are below -");
	List<WebElement> cf = driver.findElements(By.xpath("//*[@class='despositsummary']//td[text()='Confirmation Number:']//following-sibling::*[1]"));
    
	for(int i=0;i<cf.size();i++) {
		String sto = cf.get(i).getText();
		System.out.println(sto);
    		
    	
		
	
	
	
}
	
	}
		
		//WebElement close = driver.findElement(By.xpath("//*[text()='Close Window']"));
		//close.click();
		

}
