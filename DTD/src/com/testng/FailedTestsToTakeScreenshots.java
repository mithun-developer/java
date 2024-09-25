package com.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


import com.util.Base;
import com.util.CustomListeners;

@Listeners(CustomListeners.class)
public class FailedTestsToTakeScreenshots extends Base{
	
	@BeforeMethod
	public void setup() {
		initialisation();
	}
	
	
	
	@Test
	public void logintest() {
		AssertJUnit.assertEquals(false, true);
	}
	
	@Test
	public void searchtest() {
		AssertJUnit.assertEquals(false, true);
	}
	
	@Test
	public void createDealsTest() {
		AssertJUnit.assertEquals(false, true);
	}
	
	@AfterMethod
	public void creataeContactsTest() {
		driver.quit();
	}

}
