package com.netbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Add_New_Customer {

	public static WebDriver ldriver;
	public Add_New_Customer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	//@FindBy(how = How.CSS, using ="body > div:nth-child(6) > div > ul > li:nth-child(2) > a")
	//public WebElement new_customer; 
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	public WebElement new_customer; 
	
	@FindBy(name="name")
	public WebElement name;
	
	@FindBy(xpath="//*[@value='f']")
	public WebElement gender;
    
	@FindBy(id="dob")
	public WebElement birthdate;
	
	@FindBy(name="addr")
	public WebElement address;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;

	@FindBy(name="pinno")
	public WebElement pin_no;
	
	@FindBy(name="telephoneno")
	public WebElement mob_no;
	
	@FindBy(name="emailid")
	public WebElement emailid;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//*[@value='Submit']")
	public WebElement submit;
    
	
	
	
	
    
	
	
}
