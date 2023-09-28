package TestNg;

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

public class LoginToOrangeHRM_Edge {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		driver = new EdgeDriver();

		System.out.println("i am in @BeforeSuite method ");
	}

	@BeforeTest
	public void maximizeBriwser() {

		driver.manage().window().maximize();

		System.out.println("i am in @BeforeTest method ");

	}

	@BeforeClass
	public void launchURL() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("i am in @Beforeclass method ");

	}

	@BeforeMethod
	public void wait1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("i am in @Beforemethod method ");

	}

	@Test(priority = 1)
	public void enterUsername() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("i am in enterUsername method ");

	}

	@Test(priority = 2)
	public void enterPassword() {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("i am in enterPassword method ");

	}

	@Test(priority = 3)
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

		driver.close();

		System.out.println("i am in @afterSuite method ");

	}

}
