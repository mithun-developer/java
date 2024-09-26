package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;


public class MyTest {
	
	@Test
	public void test1() {
		AssertJUnit.assertEquals(false, true);
		
	}
	
	
	@Test
public void test2() {
		
		AssertJUnit.assertEquals(false, true);
		
	}
	
	
	@Test
	public void test3() {
			
			AssertJUnit.assertEquals(true, true);
			
		}

}
