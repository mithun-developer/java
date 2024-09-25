package com.baseDTD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static	WebDriver driver;
	

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wellsoffice.wellsfargo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='comp_id']")).sendKeys("WQADTDM4");
		driver.findElement(By.xpath(" //*[@id='user_id']")).sendKeys("wqamith");
		driver.findElement(By.xpath("//*[@id='passwordIdField']")).sendKeys("hitech@13");
		driver.findElement(By.xpath("//*[@id='ceopLoginButton']")).click();

		driver.findElement(By.xpath("//*[@id='app-wfappdsktpdp-masterLink']")).click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@class='navLinks']//li//child::*)[2]")).click();

		//WebElement li =	driver.findElement(By.xpath("//*[@name='depositAccountRtn']"));
		WebElement lise = driver.findElement(By.xpath("(//*[@name='depositAccountRtn']//option)[2]"));
		//Select s = new Select(li);
		//s.selectByIndex(1);
		Actions a = new Actions(driver);
		a.click(lise).perform();
		

		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='defaultKey']")).click();
		Thread.sleep(6000);

ArrayList<String> windowes =new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(windowes.get(2));
		List<WebElement> lis = driver.findElements(By.xpath("//*[@class='depositinfo']//strong[contains(text(),'0.01')]"));
		List<WebElement> ab = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Confirmation Number:')]//following-sibling::*[1]"));
		List<WebElement>lio = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Deposit Account:')]//following-sibling::*[1]"));
		for(int i=0;i<lis.size();i++) {

			String str=	lis.get(i).getText();
			if(str.equalsIgnoreCase("$ 0.01")) {
				System.out.println("Correct!!!");

			}else {
				System.out.println("Its Wrong!");
			}

	String stt = ab.get(i).getText();
	System.out.println(stt);
	
	String syu = lio.get(i).getText();
	System.out.println(syu);
			
		}


	}
}
