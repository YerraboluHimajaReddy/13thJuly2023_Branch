package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

	public WebDriver driver;

	public AdminPage(WebDriver driver) {

		this.driver = driver;
	}

	private By userManagement_Dropdown = By.xpath("//span[text()='User Management ']");

	private By users_Tab = By.xpath("//a[text()='Users']");

	public void clickUserManagement() {

		driver.findElement(userManagement_Dropdown).click();
	}

	public void clickUsers() {

		driver.findElement(users_Tab).click();
	}

}
