package com.dtd;

import org.openqa.selenium.By;

public class OR {
	
 public static By coid = By.id("comp_id");
 public static By userid = By.id("user_id");
 public static By pw = By.id("passwordIdField");
 public static By sign = By.id("ceopLoginButton");
 
 //Pending deposit page
 
 public static By dtd =By.xpath("//*[@class='wf2ceop-appLink']");
 
 public static By advsearch =By.xpath("(//*[@class='sbuttons']//child::*)[1]");
 
 public static By dd = By.xpath("//*[@name='depositAccountRtn']");
 
 public static By search = By.id("defaultKey");
 
 public static By refine = By.xpath("((//*[@class='right'])[2]//child::*)[3]");
 
 public static By amt = By.id("formattedFromCheckAmount");
 
 public static By amnt = By.id("formattedToCheckAmount");
 
 public static By radio = By.name("radioButton");
 
 public static By view = By.xpath("(//*[@class='dtdRedButton'])[2]");
 
 public static By exit = By.xpath("//*[@class='dtdRedButton']");
 
 public static By close =By.xpath("//*[@id='signOffId']");
 
 public static By soff = By.xpath("//*[@class='wf2-gn-signoff']");
 
 
 
 
}
