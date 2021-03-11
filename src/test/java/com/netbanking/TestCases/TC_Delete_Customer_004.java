package com.netbanking.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.PageObjects.Delete_Customer;
import com.netbanking.PageObjects.LoginPage;

public class TC_Delete_Customer_004 extends BaseClass {

	
	
	@Test
	public void login() throws InterruptedException
	{
		driver.manage().window().maximize();
		LoginPage p= new LoginPage(driver);
		p.username.sendKeys(username);
		p.password.sendKeys(password);
		p.Login.click();
	
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Delete Customer']")));
		element.click();
	
		Delete_Customer dc=new Delete_Customer(driver);
	//dc.delete_customer.click();
	
	dc.enter_id.sendKeys("2721");
	Thread.sleep(5000);
	dc.submit.click();
	Thread.sleep(10000);
	
	driver.switchTo().alert().accept();
	driver.switchTo().alert().accept();
	
	//Assert.assertEquals(actual, expected);
}
	/*public void validation()
	{
		boolean status=driver.getPageSource().contains("Customer Deleted Successfully!!");
		
		if(status==true)
			{
			
			}
			
	}*/
}