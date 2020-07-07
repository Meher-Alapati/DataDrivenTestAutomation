package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	//PageFactory / Repository
	
	@FindBy(xpath="//input[@name='email']")WebElement emailid;	
	@FindBy(xpath="//input[@name='password']")WebElement password;	
	@FindBy(xpath="//div[text()='Login']")WebElement Login;	
	@FindBy(xpath="//a[text()='Sign Up']")WebElement SignUp;	
	
	//Initialize the pageFactory Web Elements
	public LoginPage()
	{
		PageFactory.initElements(driver, this);		
	}
	
	//Page Functions
	
	public HomePage Login(String UserName, String Password)
	{
		emailid.sendKeys(UserName);
		password.sendKeys(Password);
		Login.click();		
		return new HomePage();
	}
	
		
	
	
	

}
