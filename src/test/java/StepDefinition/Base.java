package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base  {

	public WebDriver driver;
	
	public void openApp() {
		System.out.println("Browser is opening");
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("http://localhost:3000/");
	}
	
	public void closeApp() {
		driver.quit();
	}
	
	
	
	
}
