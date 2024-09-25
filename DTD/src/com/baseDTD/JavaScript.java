package com.baseDTD;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));
		coid.sendKeys("wqadtdm4");
	js.executeScript("arguments[0].style.border = '3px dashed blue';",coid);

		
		WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));
		userid.sendKeys("wqamith");
	js.executeScript("arguments[0].style.border = '3px dashed blue';",userid);
		
		WebElement pw = driver.findElement(By.xpath("//*[@id='passwordIdField']"));
		pw.sendKeys("hitech@13");
		js.executeScript("arguments[0].style.border = '3px dashed blue';",pw);

		
		
		
		
		Thread.sleep(5000);
		js.executeScript("document.getElementById('ceopLoginButton').click();");
		
		Thread.sleep(10000);
		WebElement ceo = driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
		
		js.executeScript("arguments[0].click();",ceo);
		
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.manage().window().maximize();
		Thread.sleep(8000);
		WebElement dl = driver.findElement(By.xpath("//a[contains(text(),'Download Scanner Driver')]"));
		js.executeScript("arguments[0].click();",dl);
		
		WebElement digi = driver.findElement(By.xpath("//a[contains(text(),'Download Digital Check Scanner Driver v2.2')] "));
		js.executeScript("arguments[0].click();",digi);
		Thread.sleep(12000);
		
		String str = "C:\\Users\\Mithun\\Downloads\\DCS_2.2.exe";
	
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_WINDOWS);
		//rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_WINDOWS);
		//rb.keyRelease(KeyEvent.VK_R);
		Thread.sleep(3000);
		StringSelection ss = new StringSelection(str);
		Toolkit tl = Toolkit.getDefaultToolkit();
		Clipboard cl = tl.getSystemClipboard();
		cl.setContents(ss, null);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		//****************************************************************************************************
		
		//javascript methods for interview purpose - NOT RELATED TO THIS CLASS
		js.executeScript("window.scrollBy(100,100)","");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();",digi);
		
		
		
		String sst = (String)js.executeScript("return document.title"); // to read a JavaScript variable 
		js.executeScript("document.getElementById('userid').value=test.com");	 // to send text in the text box 
		js.executeScript("document.getElementsByClassName(ElementLocator).click();"); // hidden elements 

	     //****************************************************************************************************	
		
		/*WebElement rep =driver.findElement(By.linkText("Create Reports"));
		js.executeScript("arguments[0].click();",rep);
		
		WebElement name = driver.findElement(By.xpath("//*[@class='profile']//strong"));
		String stu = name.getText();
	
		if(stu.equalsIgnoreCase("Mithun Modali")) {
			System.out.println("User name is correct, you can proceed !");
		}else {
			System.out.println("User name is incorrect, logout from the application" );
		}
		
		driver.findElement(By.xpath("//*[@id='signOffId']")).click();
		ArrayList<String> windoew = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windoew.get(0));
		
		WebElement sof = driver.findElement(By.xpath("//*[@class='wf2-gn-signoff']"));
		
		js.executeScript("arguments[0].click();",sof);
		driver.close();*/
		
		
	}
}
