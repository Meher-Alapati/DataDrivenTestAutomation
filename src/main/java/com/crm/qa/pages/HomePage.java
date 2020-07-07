package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//span[text()='Log In']")WebElement Login;
	@FindBy(xpath="//span[text()='Meher Alapati']")WebElement UserDisplay;
	@FindBy(xpath="//span[text()='Contacts']")WebElement Contacts;
	@FindBy(xpath="//span[text()='Calendar']")WebElement Calendar;
	@FindBy(xpath="//span[text()='Companies']")WebElement Companies;
	@FindBy(xpath="//span[text()='Deals']")WebElement Deals;
	@FindBy(xpath="//span[text()='Tasks']")WebElement Tasks;
	@FindBy(xpath="//span[text()='Cases']")WebElement Cases;
	@FindBy(xpath="//span[text()='Calls']")WebElement Calls;
	@FindBy(xpath="//span[text()='Documents']")WebElement Documents;
	@FindBy(xpath="//span[text()='Email']")WebElement Email;
	@FindBy(xpath="//span[text()='Campaigns']")WebElement Campaigns;
	@FindBy(xpath="//span[text()='Forms']")WebElement Forms;
	@FindBy(xpath="//span[@class='trial-indicator']")WebElement AccType;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle()
	{
		String user = UserDisplay.getText();
		return user;
	}
	
	public String getAccountType()
	{
		String acctype = AccType.getText();
		return acctype;
	}
	
	public Contacts GotoContactsPage()
	{	
		Contacts.click();
		System.out.println("Contacts page is loaded");
		return new Contacts();
	}
	
	public Deals GotoDealsPage()
	{	
		Deals.click();
		return new Deals();
	}
	public Tasks GotoTasksPage()
	{	
		Tasks.click();
		return new Tasks ();
	}
	
	
	
	
	
	
	
	
	

}
