package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ToAvoidNotificationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//ChromeOptions settings = new ChromeOptions();
		//settings.addArguments("--disable-notifications");
		//settings.addArguments("--incognito");
		//ChromeDriver driver=new ChromeDriver(settings);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("dom.webnotification.enabled", true);
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.get("https://www.easemytrip.com/");
	}
}
