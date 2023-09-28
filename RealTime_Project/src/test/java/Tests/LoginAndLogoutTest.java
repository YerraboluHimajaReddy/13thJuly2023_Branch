package Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BaseClass;
import Methods.HomePageMethods;
import Pages.AdminPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;

public class LoginAndLogoutTest extends BaseClass {

	LoginPage lp;
	
	HomePageMethods hpm;
	
	AdminPage ap;	
	
	SignOutPage sp;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunching("chrome");
		
		takeScreenshot("BrowserLaunched");
		
		// Page object model

		lp = new LoginPage(driver);
		
		hpm = new HomePageMethods(driver);

		ap = new AdminPage(driver);
		
		// page factory
		
		sp = PageFactory.initElements(driver, SignOutPage.class);
		
		System.out.println("i am in @BeforeSuite method ");
	}

	@BeforeTest
	public void maximizeBriwser() throws IOException {

		browserMaximization();
		
		takeScreenshot("Browser Maximized");

		System.out.println("i am in @BeforeTest method ");

	}

	@BeforeClass
	public void launchURL() throws IOException {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		takeScreenshot("URL Launched");

		System.out.println("i am in @Beforeclass method ");

	}

	@BeforeMethod
	public void wait1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("i am in @Beforemethod method ");

	}

	@Test(priority = 1)
	public void enterUsername() throws IOException {

		lp.enterUserName();
		
		takeScreenshot("Username");

		System.out.println("i am in enterUsername method ");

	}

	@Test(priority = 2)
	public void enterPassword() throws IOException {

		lp.enterPassword();
		
		takeScreenshot("password");

		System.out.println("i am in enterPassword method ");

	}

	@Test(priority = 3)
	public void clickLogin() {

		lp.clickLogin();

		System.out.println("i am in clicklogin method ");

	}
	
	@Test(priority = 4)
	public void clickAdmin() throws IOException {

		hpm.clickAdmin();

		takeScreenshot("admin");

		System.out.println("i am in clicklogin method ");
	}
	
	@Test(priority = 5)
	public void clickUsersTab() throws IOException {

		ap.clickUserManagement();
		
		ap.clickUsers();

		takeScreenshot("users");

		System.out.println("i am in clicklogin method ");
	}
	
	@Test(priority = 6)
	public void logout() {
		
		hpm.clickPaulCollings();
		
		sp.clickLogout();
		
		lp.clickForgotYourPassword();
	}

	@AfterMethod
	public void wait2() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("i am in @Aftermethod method ");

	}

	@AfterSuite
	public void closeBrowser() {

		//driver.close();

		System.out.println("i am in @afterSuite method ");

	}

}
