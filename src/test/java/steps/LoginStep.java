package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.LogoutPage;

public class LoginStep {
//	LoginPage login;
//	LogoutPage logout;
//	WebDriver driver = null;
//	
//	@Given("^open browser$")
//	public void open_browser() {
//	    String projectPath = System.getProperty("user.dir");
//	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//	    
//	    driver = new ChromeDriver();
//	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//	    
//	    
//	}
//	
//	@And("^user is on login page$")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_name_and_password(String username, String password) {
//		login = new LoginPage(driver);
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//	    
//	}
//
//	@And("^click on login button$")
//	public void click_on_login_button() {
//	    login.clickLogin();
//	}
//
//	@Then("^check user home page$")
//	public void check_user_home_page() {
//		logout = new LogoutPage(driver);
//		
//		logout.checkLogout();
//		
//		driver.close();
//		driver.quit();
//	}
}
