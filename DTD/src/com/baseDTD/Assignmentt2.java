package com.baseDTD;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Assignmentt2 {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void main(String[] args) throws InterruptedException, BiffException, IOException, AWTException, HeadlessException, UnsupportedFlavorException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		/*WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
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

		//List<WebElement> depositname = driver.findElements(By.xpath("//*[@class='smaller'][2]"));
		List<WebElement>conf = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Confirmation Number:')][1]"));
		List<WebElement>depby = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Deposited By:')][1]"));
		List<WebElement>bagnum = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Bag Number:')][1]"));
		List<WebElement>numitems = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'No. of Items:')][1]"));
		List<WebElement>date = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Submission Date/Time:')][1]"));
		List<WebElement>created = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Created By:')][1]"));
		List<WebElement>loc = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Location ID:')][1]"));
		List<WebElement>depacc = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Deposit Account:')][1]"));
		
		 List<WebElement> depositstatus = driver.findElements(By.xpath("//*[@class='despositsummary']//td[contains(text(),'Deposit Status:')]//following-sibling::*"));
	/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter input");
		if(sc.nextLine()=="conf") {
		
				System.out.println("//*[@class='despositsummary']//td[contains(text(),'Confirmation Number:')][1]");
     

}
		 
		 for(int i=0;i<conf.size();i++) {
			String st = conf.get(i).getText();
			System.out.println(st);
		 }
	}
}*/
		
		js = (JavascriptExecutor) driver;
		
	/*	String str = "C:\\New Text Document (3).txt";
		Robot rb = new Robot();
		
		StringSelection ss = new StringSelection(str);
		Toolkit tl = Toolkit.getDefaultToolkit();
		Clipboard cl = tl.getSystemClipboard();
		cl.setContents(ss, null);
		
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_WINDOWS);
		rb.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(4000);
		
		
		
	
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(4000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_C);
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_ALT);
		rb.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(3000);
		
		String so = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		File ff = new File(so);
		Workbook wb = Workbook.getWorkbook(ff);
		String sd = wb.getSheet(0).getCell(0, 1).getContents();
		System.out.println(sd);*/
		
	/*	String st ="C:\\Users\\Mithun\\eclipse-workspace\\DTD\\allfiles\\Test.xls";
		File ff = new File(st);
		Workbook wb = Workbook.getWorkbook(ff);
		Sheet sht = wb.getSheet(0);
		String sl = sht.getCell(1, 1).getContents();
		System.out.println(sl);*/
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_2zrpKA']")).sendKeys("mithun.modali@gmail.com");*/
		//driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
		
		/*WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
		coid.sendKeys("wqadtdm4");
		js.executeScript("arguments[0].style.border = '3px dashed blue';",coid);
		WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));
		userid.sendKeys("wqamith");
		js.executeScript("arguments[0].style.border = '3px dashed blue';",userid);
		WebElement pw = driver.findElement(By.xpath("//*[@id='passwordIdField']"));
		pw.sendKeys("hitech@12");
		js.executeScript("arguments[0].style.border = '3px dashed blue';",pw);
		
		Thread.sleep(3000);

		WebElement signOn = driver.findElement(By.xpath("//*[@id='ceopLoginButton'] "));
		js.executeScript("document.getElementById('ceopLoginButton').click();",signOn);*/
		
		
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.xpath("//*[@class='ui selection dropdown']"));
		//Select s= new Select(dd);
		Actions a = new Actions(driver);
		a.click(dd).sendKeys("male").click().perform();
	
		WebElement dde = driver.findElement(By.xpath("(//*[@class='ui fluid selection dropdown'])[1]"));
		Actions aa = new Actions(driver);
		aa.click(dde).perform();
		Thread.sleep(3000);
	for(int i=0;i<6;i++) {
		aa.click(dde).sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(3000);
		aa.click(dde).sendKeys(Keys.ENTER).perform();
		
		WebElement ddr = driver.findElement(By.xpath("(//*[@class='search'])[1]"));
		Actions av = new Actions(driver);
		av.click(ddr).sendKeys("India").perform();
		Thread.sleep(3000);
		av.click(ddr).sendKeys(Keys.ENTER).perform();
		
		
		WebElement ddf = driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
		Actions ab = new Actions(driver);
		ab.click(ddf).sendKeys("G").perform();
		Thread.sleep(3000);
		ab.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		ab.click(ddf).sendKeys("E").perform();
		ab.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		ab.click(ddf).sendKeys("J").perform();
		ab.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		
		
		ab.sendKeys(Keys.ESCAPE).perform();
		
		
		WebElement dds =driver.findElement(By.xpath("(//*[@class='dropdown icon'])[16]"));
		Actions ao =new Actions(driver);
		for(int i=0;i<3;i++) {
			ao.click(dds).sendKeys(Keys.ARROW_DOWN).perform();	
		}
		
		Thread.sleep(3000);
		//ao.click(dds).sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(3000);
		
		ao.sendKeys(Keys.ENTER).perform();
		
		WebElement ddg = driver.findElement(By.xpath("(//*[@class='filter icon'])[1]"));
		WebElement ddgk = driver.findElement(By.xpath("(//*[@class='ui icon search input'])[2]"));
		Actions ae = new Actions(driver);
		ae.click(ddg).click().perform();
		Thread.sleep(5000);
		
		Actions ak = new Actions(driver);
		ak.click(ddgk).sendKeys("News").perform();
		ak.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		ak.click(ddgk).sendKeys("Announcement").perform();
		ak.sendKeys(Keys.ENTER).perform();
		
		
		
	}
}
