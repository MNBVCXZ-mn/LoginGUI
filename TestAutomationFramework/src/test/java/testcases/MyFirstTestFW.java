package testcases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSData;

public class MyFirstTestFW extends BaseTest {
	@Test(dataProviderClass=ReadXLSData.class,dataProvider="bvtdata")
	public static void  loginTest(String username, String password) throws InterruptedException {
		
		
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(2000);

		driver.findElement(By.id(loc.getProperty("pwd_filed"))).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(2000);

	  
	
	}
}
