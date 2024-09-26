package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Base {


	public static void login() throws InterruptedException {
		driver.findElement((OR.mob)).sendKeys("9848379233");
		driver.findElement((OR.pw)).sendKeys("mithun123");
		Thread.sleep(2000);
		driver.findElement((OR.cont)).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement men = driver.findElement((OR.men));
		a.moveToElement(men).build().perform();
		Thread.sleep(3000);
		WebElement sho = driver.findElement((OR.shoes));
		a.click(sho).build().perform();

	WebElement dr = driver.findElement((OR.set));

		a.dragAndDropBy(dr, 857, 33).build().perform();


	}

}


