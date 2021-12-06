package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage_PF;
import pageFactory.LogoutPage_PF;

public class LoginStep_PF {
	LoginPage_PF login;
	LogoutPage_PF logout;
	WebDriver driver = null;
	
	@Before(order=1)
	public void setUp() {
	    String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    
	    
	}
	
	@Before(order=0, value="@SmokeFeature")
	public void setUp2() {
	    System.out.println("Setup 2");
	    
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("beforeStep");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("afterStep");
	}
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_name_and_password(String username, String password) {
		login = new LoginPage_PF(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
	    
	}

	@And("^click on login button$")
	public void click_on_login_button() {
	    login.clickLogin();
	}

	@Then("^check user home page$")
	public void check_user_home_page() {
		logout = new LogoutPage_PF(driver);
		
		logout.checkLogout();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
