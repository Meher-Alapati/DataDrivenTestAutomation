package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LandingPageTests extends TestBase{
	
	LandingPage LandingPage;
	
	public LandingPageTests()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		LandingPage= new LandingPage();
		
	}	
	
	@Test
	public void verifyLandingPage()
	{		
		String title = LandingPage.ValidateCRMLandingPage();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");		
	}
	
	@Test
	public void GotoLoginPage()
	{
		LandingPage.GotoLogin();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
