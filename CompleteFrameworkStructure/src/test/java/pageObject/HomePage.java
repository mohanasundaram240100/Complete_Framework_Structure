package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePage.BasePage;

public class HomePage {
	
	
	WebDriver driver;
	
	//Constructors
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	By Myaccount_Loc=By.xpath("//span[normalize-space()='My Account']");
	By Register_Loc=By.xpath("//a[normalize-space()='Register']");
	
	
	//Action Methods
	
	public void myaccount()
	{
		driver.findElement(Myaccount_Loc).click();
	}
	
	public void Register()
	{
		driver.findElement(Register_Loc).click();
	}

}
