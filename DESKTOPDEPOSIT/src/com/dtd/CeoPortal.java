package com.dtd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CeoPortal extends Base{
	
public static void loginPage() throws InterruptedException {
	
	
driver.findElement((OR.coid)).sendKeys("wqadtdm4");

driver.findElement((OR.userid)).sendKeys("wqamith");

driver.findElement((OR.pw)).sendKeys("hitech@13");

driver.findElement((OR.sign)).click();
Thread.sleep(5000);

WebElement abc = driver.findElement((OR.dtd));
js.executeScript("arguments[0].click();",abc);




}

}
