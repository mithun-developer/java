package com.qaa;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestIt {
	
	@Test
	public void sum () {
		System.out.println("Sum Method");
		int a =10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void subtract () {
		System.out.println("subtract Method");
		int a =10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void multiplication () {
		System.out.println("multiplication Method");
		int a =10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	
	@Test
	public void division () {
		System.out.println("division Method");
		int a =10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}

}
