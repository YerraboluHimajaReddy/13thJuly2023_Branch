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

public class Attribute_InvocationCount extends BaseClass {
	
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
	
	@Test(invocationCount = 13)
	public void enterUsername() {		
		
		enterTextToTheTextbox("//input[@name='username']","Admin");		
		
	}

	@Test(dependsOnMethods = "enterUsername")
	public void enterPassword() {

		enterTextToTheTextbox("//input[@name='password']","admin123");

	}
	
	@AfterMethod
	public void wait2() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("i am in @Aftermethod method ");

	}

	@AfterSuite
	public void closeBrowser() {

		//browserClose();

		System.out.println("i am in @afterSuite method ");

	}
}
