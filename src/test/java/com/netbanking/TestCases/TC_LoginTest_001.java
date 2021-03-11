package com.netbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
	
	logger.info("url is opened");
	
	LoginPage l=new LoginPage(driver);
	l.username.sendKeys(username);
	logger.info("entered username");
	l.password.sendKeys(password);
	logger.info("entered password");
	l.Login.click();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
		Assert.assertTrue(true);
		logger.info("login test passed");
		}
	else
	{
		Assert.assertTrue(false);
		}
	
	}








}
