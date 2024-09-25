package com.baseDTD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DTDSearch1 {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\eclipse-workspace\\DTD\\Browser Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;



		driver.get("https://wellsoffice.wellsfargo.com/portal/signon");

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);


		WebElement coid = driver.findElement(By.xpath("//*[@id='comp_id']"));


		//js.executeScript("arguments[0].value='wqadtdm4';", coid);
		//js.executeScript("arguments[0].getElementById('comp_id').click();");



		coid.sendKeys("wqadtdm4");
		WebElement userid = driver.findElement(By.xpath("//*[@id='user_id']"));


		js.executeScript("arguments[0].style.border='3px solid blue';", userid);


		userid.sendKeys("wqamith");
		WebElement pw= driver.findElement(By.xpath("//*[@id='passwordIdField'] "));
		pw.sendKeys("hitech@14");
		WebElement signOn = driver.findElement(By.xpath("//*[@id='ceopLoginButton']"));
		js.executeScript("arguments[0].click();", signOn);
		signOn.click();

		WebElement dtd = driver.findElement(By.xpath("//*[@class='wf2ceop-appLink']"));
		dtd.click();
		
		driver.manage().window().maximize();

		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(1));
		
		

		WebElement amt = driver.findElement(By.xpath("//*[@name='searchValue']"));
		amt.sendKeys("0.01");
		Thread.sleep(5000);
		WebElement searchButton = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButton.click();

		WebElement	amount = driver.findElement(By.xpath("//*[@align='right']"));
		String str = amount.getText();
		if(str.contains("$ 0.01")) {
			System.out.println("Deposit amount is correct");
		}else {
			System.out.println("Incorrect amount");
		}


		WebElement dropDown =driver.findElement(By.xpath("//*[@name='searchType'] "));

		Select s = new Select(dropDown);
		s.selectByIndex(1);
		Thread.sleep(3000);

		WebElement depAcc = driver.findElement(By.xpath("//*[@name='searchValue']"));
		depAcc.clear();
		depAcc.sendKeys("4121080725");
		WebElement searchButton1 = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButton1.click();

		WebElement account=	driver.findElement(By.xpath("//*[@class='supersized_025']//parent::td//following-sibling::*[1]"));
		String strre= account.getText();
		if(strre.contains("4121080725")) {
			System.out.println("Deposit account is correct");
		}else {
			System.out.println("Deposit account is NOT correct");
		}


		WebElement dropDownn =driver.findElement(By.xpath("//*[@name='searchType'] "));
		Select se = new Select(dropDownn);
		se.selectByIndex(2);

		WebElement rtn = driver.findElement(By.xpath("//*[@name='searchValue']"));
		rtn.clear();
		rtn.sendKeys("121000248");
		WebElement searchButton2 = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButton2.click();

		WebElement rtnn= driver.findElement(By.xpath("(//*[@class='innerdatacolumn'])[2] "));
		String sty =			rtnn.getText();
		if(sty.contains("121000248")) {
			System.out.println("RTN is correct");
		}else {
			System.out.println("RTN is not correct");
		}


		WebElement dropDownnn =driver.findElement(By.xpath("//*[@name='searchType'] "));
		Select sel = new Select(dropDownnn);
		sel.selectByIndex(3);

		WebElement acc = driver.findElement(By.xpath("//*[@name='searchValue']"));
		acc.clear();
		acc.sendKeys("4121080725");
		WebElement searchButtonn = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButtonn.click();

		WebElement chkAcc= driver.findElement(By.xpath("(//*[@class='innerdatacolumn'])[1] "));
		String stey =			chkAcc.getText();
		if(stey.contains("4121080725")) {
			System.out.println("Check Account Number is correct");
		}else {
			System.out.println("Check Account Number is not correct");
		}


		WebElement dropDownnnn =driver.findElement(By.xpath("//*[@name='searchType'] "));
		Select sele = new Select(dropDownnnn);
		sele.selectByIndex(4);

		WebElement aux = driver.findElement(By.xpath("//*[@name='searchValue']"));
		aux.clear();
		aux.sendKeys("3287");
		WebElement searchButtonnn = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButtonnn.click();

		WebElement auxe= driver.findElement(By.xpath("//*[@class='supersized_025']"));
		String strree =	auxe.getText();
		if(strree.contains("3287")) {
			System.out.println("Aux Number is correct");
		}else {
			System.out.println("Aux Number is not correct");
		}


		WebElement dropDownnnnn =driver.findElement(By.xpath("//*[@name='searchType'] "));
		Select selec = new Select(dropDownnnnn);
		selec.selectByIndex(5);

		WebElement date = driver.findElement(By.xpath("//*[@name='searchValue']"));
		date.clear();
		date.sendKeys("08/09/2018");
		WebElement searchButtonnnn = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButtonnnn.click();

		WebElement datee= driver.findElement(By.xpath("((//*[@class='supersized_025'])/parent::*/following-sibling::*)[14]"));
		String daetee= datee.getText();
		if(daetee.contains("08/09/2018")) {
			System.out.println("Date is correct");
		}else {
			System.out.println("date is not correct");
		}


		WebElement dropDownnnnnn =driver.findElement(By.xpath("//*[@name='searchType'] "));
		Select selecc = new Select(dropDownnnnnn);
		selecc.selectByIndex(6);

		WebElement loc = driver.findElement(By.xpath("//*[@name='searchValue']"));
		loc.clear();
		loc.sendKeys("001");
		WebElement searchButtonnnnn = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButtonnnnn.click();

		WebElement loca=driver.findElement(By.xpath("//*[@class='supersized_025']/parent::*/following-sibling::*"));
		String stro=loca.getText();
		if(stro.contains("001")) {
			System.out.println("Location id is correct");
		}else {
			System.out.println("Location id is not correct");
		}

		WebElement dropDownnnnnnn =driver.findElement(By.xpath("//*[@name='searchType'] "));
		Select selecct = new Select(dropDownnnnnnn);
		selecct.selectByIndex(7);

		WebElement item = driver.findElement(By.xpath("//*[@name='searchValue']"));
		item.clear();
		item.sendKeys("080918728557354");
		WebElement searchButtonnnnnn = driver.findElement(By.xpath("//*[@id='searchKey']"));
		searchButtonnnnnn.click();

		WebElement itemm=driver.findElement(By.xpath("(//*[@valign='middle'])[2]"));
		String stui=	itemm.getText();
		if(stui.contains("080918728557354")) {
			System.out.println("Item ID is correct");
		}else {
			System.out.println("Item id is not correct");
		}


	}

}
