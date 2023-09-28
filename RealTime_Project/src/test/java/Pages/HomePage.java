package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public By admin_Button = By.xpath("//span[text()='Admin']");

	public By pim_Button = By.xpath("//span[text()='PIM']");
	
	public By paulCollings_Buttoon = By.xpath("//p[@class='oxd-userdropdown-name']");

}
