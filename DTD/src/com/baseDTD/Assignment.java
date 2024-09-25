package com.baseDTD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment extends Utils{
	
	public static ArrayList<String> windows;
	
	public static void main(String args[]) throws InterruptedException {
		launchBrowser();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		sendValues("//*[@id='comp_id']", "wqadtdm4");
		sendValues("//*[@id='user_id']", "wqamith");
		sendValues("//*[@id='passwordIdField']", "hitech@12");
		klick("//*[@id='ceopLoginButton']");
		
		klick("//*[@class='wf2ceop-appLink']");
		Thread.sleep(15000);
		windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		System.out.println("1");
		//klick("(//*[@class='splash_text'])[7]");
		System.out.println("2");
		driver.manage().window().maximize();
		System.out.println("3");
		
		klick("(//*[@class='navLinks']//child::*)[6]");
		WebElement dd = driver.findElement(By.xpath("//*[@name='depositStatus']"));
		Select s = new Select(dd);
		s.selectByIndex(1);
		Thread.sleep(5000);
		klick("//*[@id='defaultKey']");
		Thread.sleep(5000);
		windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(2));
		//WebElement depcomp=driver.findElement(By.xpath("(//*[@class='despositsummary']//tr)[2]//td[4]"));
		
		List<WebElement> reports = driver.findElements(By.xpath("//*[@class='despositsummary']//tr[2]//td[4]"));
		
		for(int i=0;i<reports.size();i++) {
			List<WebElement> conf = driver.findElements(By.xpath("//*[@class='despositsummary']//td[text()='Confirmation Number:']/following-sibling::td[1]"));
			if(reports.get(i).getText().equalsIgnoreCase("deposit complete")) {
				System.out.println(conf.get(i).getText());
			}
			
		}
		
		
		
		/*List<WebElement> li = driver.findElements(By.xpath("//*[@class='despositsummary']//tr[2]//td[4]"));
		for(int i=0;i<li.size();i++) {
			String sty = li.get(i).getText();
			List<WebElement> conf = driver.findElements(By.xpath("//*[@class='despositsummary']//td[text()='Confirmation Number:']/following-sibling::td[1]"));
			for(int j=0;j<conf.size();j++) {
				String stp = conf.get(j).getText();
				
				
				List<WebElement>time = driver.findElements(By.xpath("//*[@class='despositsummary']//tr[3]//td[4]"));
				for(int k=0;k<time.size();k++) {
					String sth = time.get(0).getText();
					
					if(sty.equalsIgnoreCase("Deposit Complete")) {
						System.out.println(stp+sth);
			}else {
				System.out.println("correct");
			}
			
			}
			
			
			}
		}*/
		
		
		
	}

}
