package TestNgAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg.BaseClass;

public class Attribute_Description extends BaseClass {
	
	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");

		System.out.println("i am in @BeforeSuite method ");
	}

	@BeforeTest
	public void maximizeBriwser() {

		browserMaximization();

		System.out.println("i am in @BeforeTest method ");

	}

	@BeforeClass
	public void launchURL() {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("i am in @Beforeclass method ");

	}

	@BeforeMethod
	public void wait1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("i am in @Beforemethod method ");

	}	
	
	@Test(priority = 1, timeOut = 5000, description = "this method is used to enter user data in the login page")
	public void enterCredentials() {		
		
		enterTextToTheTextbox("//input[@name='username']","Admin");		
		
		enterTextToTheTextbox("//input[@name='password']","admin123");
	}

	@Test(priority = 2, description = "this method is used to click on the login button in the login page")
	public void clickLogin() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("i am in clicklogin method ");

	}
	
	@AfterMethod
	public void wait2() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("i am in @Aftermethod method ");

	}

	@AfterSuite
	public void closeBrowser() {

		browserClose();

		System.out.println("i am in @afterSuite method ");

	}
}
