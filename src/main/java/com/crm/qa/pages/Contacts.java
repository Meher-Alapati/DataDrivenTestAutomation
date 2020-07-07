package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Contacts extends TestBase{
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement lblContacts;
	
	
	public Contacts()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifycontactLabel()
	{
		return lblContacts.isDisplayed();
		
	}
		
		
		
		
	
	

}
