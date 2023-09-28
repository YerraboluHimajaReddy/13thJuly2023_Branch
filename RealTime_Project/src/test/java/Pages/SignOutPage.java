package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOutPage {

	public WebDriver driver;

	public SignOutPage(WebDriver driver) {

		this.driver = driver;
	}

	// 1st way
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[text()='About']")
	public WebElement about_button;

	// 2nd way

	@FindBy(xpath = "//a[text()='Support']")
	public WebElement support_button;
	
	@FindBy(xpath = "//a[text()='Change Password']")
	public WebElement changePassword_button;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logout_button;

	public void clickAbout() {

		about_button.click();
	}

	public void clickSupport() {

		support_button.click();
	}
	
	public void clickChangePassword() {

		changePassword_button.click();
	}
	
	public void clickLogout() {

		logout_button.click();
	}

}
