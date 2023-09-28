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

public class Attribute_DataProvider extends BaseClass {
	
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

	@Test(priority = 3)
	public void clickLogin() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("i am in clicklogin method ");

	}
	
	@DataProvider(name ="orangeHRMData")
	public Object[][] getData()
	{
		Object[][] values =  new Object[6][2];
		
		values[0][0] = "uma";
		values[0][1] = "uma Testing";
		
		values[1][0] = "Surya";
		values[1][1] = "Surya Testing";
		
		values[2][0] = "Swarna";
		values[2][1] = "Swarna Testing";
		
		values[3][0] = "Satish";
		values[3][1] = "Satish Testing";
		
		values[4][0] = "Mahi";
		values[4][1] = "Mahi Testing";
		
		values[5][0] = "Admin";
		values[5][1] = "admin123";
		
		return values;
	}
	
	@Test(priority=1, dataProvider = "orangeHRMData")
	public void execute(String Username, String password) {
		
		
		enterTextToTheTextbox("//input[@name='username']",Username);		
		
		enterTextToTheTextbox("//input[@name='password']",password);
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
