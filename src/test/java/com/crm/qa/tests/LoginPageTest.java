package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.HomePage;

public class LoginPageTest extends TestBase{
	
	LoginPage Loginpage;
	HomePage HomePage;
	
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		Loginpage= new LoginPage();
	}	
	
	@Test
	public void LoginTest()
	{		
		HomePage = Loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		//HomePage = Loginpage.Login("chakri.rit@gmail.com","password");
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
