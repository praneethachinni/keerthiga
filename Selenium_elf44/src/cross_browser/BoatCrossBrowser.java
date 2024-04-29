package cross_browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BoatCrossBrowser {
	@Parameters("bname")
	@Test
	public void casioCrossBrowser(@Optional("chrome")String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
        	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    		driver=new ChromeDriver();
		}
        else if (browserName.equalsIgnoreCase("firefox")) {
        	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
    		driver=new FirefoxDriver();
		}
        else {
        	Reporter.log("Invalid Browse Name",true);
        }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.get("https://www.boat-lifestyle.com/");
	}

}
