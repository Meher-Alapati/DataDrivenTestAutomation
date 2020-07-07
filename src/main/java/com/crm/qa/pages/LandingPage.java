package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase{
	
	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement SignUp;
	//@FindBy(xpath="//span[text()='Log In']")
	@FindBy(xpath="//a[contains(@class,'btn btn-primary')]")
	WebElement Login;	
	
	
	
	//Initialize the pageFactory Web Elements
	public LandingPage()
	{
		PageFactory.initElements(driver, this);		
	}
	
	//Actions 
	 public String ValidateCRMLandingPage()
	 {
		 if (SignUp.isDisplayed())		 
			 Assert.assertTrue(true);	
		 return driver.getTitle();
	 }
	 
	 public void GotoLogin()
	 {
		 Login.click();
		 System.out.println("Login Page Appeared");
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	


}
