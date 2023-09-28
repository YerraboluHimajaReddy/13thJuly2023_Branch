package Common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	
	public WebDriver driver;

	public void browserLaunching(String browserName) {
		
		if (browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver ();
		}
		else if (browserName.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver ();
		}
	}
	
	public void urlLaunching(String url) {
		
		driver.get(url);
	}
	
	
	public void browserMaximization() {

		driver.manage().window().maximize();		
	}

	public void browserClose() {
		
		driver.quit();
	}
	
	public  void enterTextToTheTextbox(String element, String text) {
		
		driver.findElement(By.xpath(element)).sendKeys(text);		
	}
	
	public void takeScreenshot(String imageName) throws IOException {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("C:\\Users\\himaj\\eclipse-workspace\\13thJuly2023Batch\\Attribute_DataProvider\\src\\test\\java\\Screenshots\\"+imageName+".png"));
	}
}
