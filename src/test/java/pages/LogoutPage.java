package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	protected WebDriver driver;
	
	private By btn_logout = By.id("logout");
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkLogout() { 
		driver.findElement(btn_logout).isDisplayed();
	}
	
}


