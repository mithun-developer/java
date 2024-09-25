package com.baseDTD;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DtdReportsItemDetails extends Utils {

	public static void main(String args[]) throws InterruptedException {
		launchBrowser();
		sendValues("//*[@id='comp_id']", "wqadtdm4");
		sendValues("//*[@id='user_id']", "wqamith");
		sendValues("//*[@id='passwordIdField']", "hitech@13");
		klick("//*[@id='ceopLoginButton']");
		Thread.sleep(5000);
		klick("//*[@class='wf2ceop-appLink']");
		
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		klick("(//*[@class='navLinks']//child::*)[6]");
		
		WebElement dd = driver.findElement(By.xpath("//*[@name='depositStatus']"));
		Select s = new Select(dd);
		s.selectByIndex(5);
		
		sendValues("//*[@name='fromDepositDate']","09/01/2018");
		sendValues("//*[@name='toDepositDate']","10/19/2018");
		klick("(//*[@type='radio'])[2]");
		Thread.sleep(2000);
		klick("//*[@id='defaultKey']");
		Thread.sleep(3000);
		ArrayList<String>windowse = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowse.get(2));
		
		klick("((//*[@class='reportData']//tr)[2]//child::*)[1]//child::*");
		Thread.sleep(3000);
		ArrayList<String> windoow = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windoow.get(3));
		
		WebElement ima = driver.findElement(By.xpath("((//*[@class='lightpaddedrow']//tr)[2]//td)[3]"));
		String stt = ima.getText();
		if(stt.contains("121000248")) {
			System.out.println("This check is from Wellsfargo");
		}else {
			System.out.println("This check is NOT from Wellsfargo");
		}
			
		
	}
}
