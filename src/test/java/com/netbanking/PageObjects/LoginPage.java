package com.netbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(name="uid")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="btnLogin")
	public WebElement Login;
	
	@FindBy(partialLinkText="Log out")
	public WebElement Logout;
	
	public void setusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void login()
	{
		Login.click();
	}

	}


