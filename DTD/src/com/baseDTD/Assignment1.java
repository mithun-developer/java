package com.baseDTD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment1 {

	public static WebDriver driver;
	

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
		coid.sendKeys("wqadtdm4");
		WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));
		userid.sendKeys("wqamith");
		WebElement pw = driver.findElement(By.xpath("//*[@id='passwordIdField']"));
		pw.sendKeys("hitech@12");

		WebElement signOn = driver.findElement(By.xpath("//*[@id='ceopLoginButton'] "));
		signOn.click();
		Thread.sleep(4000);

		WebElement dtd = driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
		dtd.click();

		Thread.sleep(10000);
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));

		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Download Scanner Driver")).click();

		WebElement createreports = driver.findElement(By.xpath("(//*[@class='navLinks']//li//child::*)[2]"));
		createreports.click();

		WebElement dd = driver.findElement(By.xpath("//*[@name='depositStatus']"));
		Select s = new Select(dd);
		s.selectByIndex(1);
		Thread.sleep(5000);
		WebElement clickCreatereport = driver.findElement(By.xpath("//*[@id='defaultKey']"));
		clickCreatereport.click();

		Thread.sleep(5000);
		ArrayList<String> windowes = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowes.get(2));
		
		
		List<WebElement> depositname = driver.findElements(By.xpath("//*[@class='smaller'][2]"));
		List<WebElement>conf = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Confirmation Number:')]//following-sibling::*[1]"));
		/*List<WebElement>depby = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Deposited By:')]//following-sibling::*[1]"));
		List<WebElement>bagnum = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Bag Number:')]//following-sibling::*[1]"));
		List<WebElement>numitems = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'No. of Items:')]//following-sibling::*[1]"));
		List<WebElement>date = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Submission Date/Time:')]//following-sibling::*[1]"));
		List<WebElement>created = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Created By:')]//following-sibling::*[1]"));
		List<WebElement>loc = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Location ID:')]//following-sibling::*[1]"));
		List<WebElement>depacc = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Deposit Account:')]//following-sibling::*[1]"));
		
		 List<WebElement> depositstatus = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Deposit Status:')]//following-sibling::*"));*/
		
      for(int i=0;i<depositname.size();i++) {
    	String stt= depositname.get(i).getText();
    	if(stt.contains("-")) {
    		System.out.println("There is no deposit name");
    	}else{
    		System.out.println(stt+":"+conf.get(i).getText());
    	}
    	{
    		
    	}
    	}
      
      
     
    	
	}
	
	


}


