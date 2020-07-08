package com.crm.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class Contacts extends TestBase{
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement lblContacts;
	
	
	@FindBy(xpath="//button[@class='ui linkedin button' and text()='New']")
	WebElement newContactlnk;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	@FindBy(xpath="//div[@name='company']")
	WebElement company;
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email;
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement save;
	
		
	
	
	public Contacts()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifycontactLabel()
	{
		return lblContacts.isDisplayed();		
	}
		
	public void ClickNewContact()
	{
		newContactlnk.click();
	}
	
	public void createNewContact(String firstname, String LName, String cName, String emailID)
	{
		ClickNewContact();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
		firstName.sendKeys(firstname);
		lastName.sendKeys(LName);
		email.sendKeys(emailID);
		save.click();
	}
		
		
	
	

}
