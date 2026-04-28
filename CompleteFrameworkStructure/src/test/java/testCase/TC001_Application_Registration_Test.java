package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;

public class TC001_Application_Registration_Test {
	
	
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test
	public void Registration()
	{
		HomePage hp = new HomePage(driver);
		hp.myaccount();
		hp.Register();
		
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.setFirstName("Mohana");
		rp.setLastName("Sundaram");
		rp.setEmail("mohan.sundaram@example.com");
		rp.setTelephone("1234567890");
		rp.setPassword("Password123");
		rp.setConfirmPassword("Password123");
		rp.subscribeYes();
		rp.acceptPrivacyPolicy();
		rp.clickContinue();
		
		Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
