package Methods;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;

public class HomePageMethods {

	public WebDriver driver;

	public HomePageMethods(WebDriver driver) {

		this.driver = driver;
	}
	
	HomePage hp = new HomePage(driver);
	
	public void clickAdmin() {

		driver.findElement(hp.admin_Button).click();		
		driver.findElement(hp.admin_Button).click();
	}
	
	public void clickPim() {

		driver.findElement(hp.pim_Button).click();
	}
	
	public void clickPaulCollings() {

		driver.findElement(hp.paulCollings_Buttoon).click();
	}

}
