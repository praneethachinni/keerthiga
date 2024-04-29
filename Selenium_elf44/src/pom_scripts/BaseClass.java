package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
 
}
