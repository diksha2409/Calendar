package StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToDo extends Base{

	@Given("To test todo open the chrome browser and launch the application")
	public void to_test_todo_open_the_chrome_browser_and_launch_the_application() {
		super.openApp();
	}
	
	
	@When("User login with username {string} and password {string}")
	public void user_login_with_username_and_password(String string, String string2) throws InterruptedException {
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("calseven");
		driver.findElement(By.name("password")).sendKeys("test");
	}

	@And("clicks on login")
	public void click_on_login() {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("User selects date and time")
	public void user_selects_date_and_time() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("todoTime")).click();
	}

	@And("User enter name for to do event")
	public void user_enter_name_for_to_do_event() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("todoItem")).sendKeys("to do item 1");
	}

	@And("User clicks on Add to do button")
	public void user_clicks_on_add_to_do_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("addTodo")).click();
	}

	@Then("App should display entry for add to do event")
	public void app_should_display_one_entry_for_add_to_do_event() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.id("todoListDisplay")).isDisplayed();
		super.closeApp();
	}

}
