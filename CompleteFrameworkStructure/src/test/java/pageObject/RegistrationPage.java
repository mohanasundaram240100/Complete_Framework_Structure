package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePage.BasePage;

public class RegistrationPage {
	
	WebDriver driver;
	
	//Constructors
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//Locators
	
	By FirstName = By.xpath("//input[@id='input-firstname']");
	By LastName = By.xpath("//input[@id='input-lastname']");
	By Email = By.xpath("//input[@id='input-email']");
	By Telephone = By.xpath("//input[@id='input-telephone']");
	By Password = By.xpath("//input[@id='input-password']");
	By ConfirmPassword = By.xpath("//input[@id='input-confirm']");
	By Subscribe_Yes = By.xpath("//label[normalize-space()='Yes']");
	By PrivacyPolicy = By.xpath("//input[@name='agree']");
	By ContinueButton = By.xpath("//input[@value='Continue']");
	
	//Action Methods
	
	public void setFirstName(String Fname)
	{
		driver.findElement(FirstName).sendKeys(Fname);
	}
	
	public void setLastName(String Lname)
	{
		driver.findElement(LastName).sendKeys(Lname);
	}
	
	public void setEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		driver.findElement(Telephone).sendKeys(telephone);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmPassword)
	{
		driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
	}
	
	public void subscribeYes()
	{
		driver.findElement(Subscribe_Yes).click();
	}
	
	public void acceptPrivacyPolicy()
	{
		driver.findElement(PrivacyPolicy).click();
	}
	
	public void clickContinue()
	{
		//driver.findElement(ContinueButton).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
	}
	
	

}
