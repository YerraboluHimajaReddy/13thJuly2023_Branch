package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass {

	LoginPage lp;

	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");

		lp = new LoginPage(driver);

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

	@Test(priority = 1)
	public void enterUsername() {

		lp.enterUserName();

		System.out.println("i am in enterUsername method ");

	}

	@Test(priority = 2)
	public void enterPassword() {

		lp.enterPassword();
		
		System.out.println("i am in enterPassword method ");

	}

	@Test(priority = 3)
	public void clickLogin() {

		lp.clickLogin();

		System.out.println("i am in clicklogin method ");

	}

	@AfterMethod
	public void wait2() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("i am in @Aftermethod method ");

	}

	@AfterSuite
	public void closeBrowser() {

		driver.close();

		System.out.println("i am in @afterSuite method ");

	}

}
