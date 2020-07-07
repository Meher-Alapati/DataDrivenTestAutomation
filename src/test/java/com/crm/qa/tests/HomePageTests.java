package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contacts;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTests extends TestBase{

	LoginPage Loginpage;
	HomePage HomePage;
	Contacts Contacts;
	
	public HomePageTests()
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
	}		
	
	@Test
	public void verifyHomePageTitle()
	{
		String user = HomePage.getHomePageTitle();
		Assert.assertEquals(user, "Meher Alapati");
	}
		
	@Test
	public void verifyAccountType()
	{
		String acctype = HomePage.getAccountType();
		Assert.assertEquals(acctype, "Free account");
	}
	
	@Test
	public void GotoContactspage() {
		Contacts =  HomePage.GotoContactsPage();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
}
