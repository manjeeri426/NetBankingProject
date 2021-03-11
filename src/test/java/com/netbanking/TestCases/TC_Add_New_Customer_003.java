package com.netbanking.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.PageObjects.Add_New_Customer;
import com.netbanking.PageObjects.LoginPage;

public class TC_Add_New_Customer_003 extends BaseClass {

	
	@Test
	public void login() throws InterruptedException
	{
		driver.manage().window().maximize();
		LoginPage p= new LoginPage(driver);
		p.username.sendKeys(username);
		p.password.sendKeys(password);
		p.Login.click();
		
	
	
	Add_New_Customer a=new Add_New_Customer (driver);
	
	//Thread.sleep(10000);
	 
	 
	 
	// Wait till the element is not visible
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.menusubnav:nth-child(1) > li:nth-child(2) > a")));
	element.click();
	
	//a.new_customer.click();
	
	a.name.sendKeys("mariya");
	Thread.sleep(2000);
	
	a.gender.click();
	Thread.sleep(2000);
	
	a.birthdate.sendKeys("19");
	Thread.sleep(2000);
	
	a.birthdate.sendKeys("04");
	Thread.sleep(2000);
	
	a.birthdate.sendKeys("1999");
	Thread.sleep(2000);
	
	a.address.sendKeys("sharda nagar");
	Thread.sleep(2000);
	
	a.city.sendKeys("kota");
	Thread.sleep(2000);
	
	a.state.sendKeys("delhi");
	Thread.sleep(2000);
	
	a.pin_no.sendKeys("489378");
	Thread.sleep(2000);
	
	a.mob_no.sendKeys("9835667777");
	Thread.sleep(2000);
	
	String email=randomestring()+"@gmail.com";
	a.emailid.sendKeys(email);
	Thread.sleep(2000);
	
	a.password.sendKeys("9234");
	Thread.sleep(2000);
	a.submit.click();
	
	Thread.sleep(10000);
	}
	
	@Test
	public void validation()
	{
		boolean status=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(status==true)
		{
			Assert.assertTrue(true);
			logger.info("test passed");
			
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("test failed");
			
		}
	}
	
}