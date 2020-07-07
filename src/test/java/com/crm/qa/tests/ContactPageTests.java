package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contacts;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTests extends TestBase{
	
	LoginPage Loginpage;
	HomePage HomePage;
	Contacts Contacts;
	
	public ContactPageTests()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		Loginpage= new LoginPage();
		Contacts = new Contacts();
		HomePage = Loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));	
		HomePage.GotoContactsPage();
	}	
	
	@Test
	public void verifyContacLabel()
	{		
		boolean isDisplayed = Contacts.verifycontactLabel();
		Assert.assertEquals(isDisplayed, true);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
