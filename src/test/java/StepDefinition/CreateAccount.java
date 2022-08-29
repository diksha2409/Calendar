package StepDefinition;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends Base {
	
	@Given("To create an account open the chrome browser and launch the application")
	public void to_create_an_account_open_the_chrome_browser_and_launch_the_application() {
		super.openApp();
	}

	@When("User click on Register Now button")
	public void user_click_on_register_now_button() throws InterruptedException {
		driver.findElement(By.linkText("Register Now")).click();
		Thread.sleep(2000);
	}

	@Then("User navigate to Register page")
	public void a_page_should_be_displayed() throws InterruptedException {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h1[1]"));
		Thread.sleep(2000);
	}

	@And("User enters following details")
	public void user_enters_following_details(DataTable userCredentials) throws InterruptedException {
		List<Map<String, String>> data = userCredentials.asMaps(String.class, String.class);
		ListIterator<Map<String, String>> li = data.listIterator();
	
		while(li.hasNext()) {
			Map<String, String> ele = li.next();
			 Set<Entry<String, String>> entrySet = ele.entrySet();
	         for(Entry<String, String> entry : entrySet) {
	        	 if(entry.getKey().equals("email"))
	        		 driver.findElement(By.name("email")).sendKeys(entry.getValue());
	        	 
	        	 if(entry.getKey().equals("name"))
	        		 driver.findElement(By.name("name")).sendKeys(entry.getValue());
	        	 
	        	 if(entry.getKey().equals("username"))
	        		 driver.findElement(By.name("username")).sendKeys(entry.getValue()+"_"+(new Random()).nextInt(999999));
	        	 
	        	 if(entry.getKey().equals("password"))
	        		 driver.findElement(By.name("password")).sendKeys(entry.getValue());
	         }
		}
		Thread.sleep(2000);
	}

	@And("User clicks on Register button")
	public void user_click_on_register_button() throws InterruptedException {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
	}

	@Then("User navigate to Calendar screen")
	public void a_screen_should_be_displayed() {
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/h1[1]"));
		super.closeApp();
	}
	
}