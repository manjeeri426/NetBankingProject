package com.netbanking.PageObjects;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Customer {

	
	public static WebDriver ldriver;
	public Delete_Customer (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[normalize-space()='Delete Customer'] ")
	public WebElement delete_customer;
	
	@FindBy(xpath="//input[@name='cusid']")
	public WebElement enter_id;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	public WebElement submit;
}
