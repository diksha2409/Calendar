package StepDefinition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAccount extends Base{

	
	@Given("To login into account open the chrome browser and launch the application")
	public void open_the_chrome_browser_and_launch_the_application() {
		super.openApp();
	}
	
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	  }
	
	@Then("User enters {string} in username field")
	public void user_enters_in_username_field(String username) {
	    driver.findElement(By.name("username")).sendKeys(username);
	}

	@And("User enters {string} in password field")
	public void user_enters_in_password_field(String password) throws InterruptedException {
		  driver.findElement(By.name("password")).sendKeys(password);
		  Thread.sleep(2000);
	}

	@And("User clicks Login button")
	public void user_clicks_login_button() {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("User navigate to Calendar Page")
	public void user_navigate_to_page() {
		WebElement actualValue = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/h1[1]"));
		String expectedValue = "CALENDAR";
		assertEquals(expectedValue, actualValue.getText());
		System.out.println("Calendar page is displayed");
		super.closeApp();
	}


	
}
