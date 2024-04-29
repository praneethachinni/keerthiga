package selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91846\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\91846\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//		FirefoxDriver driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.msedge.driver","C:\\Users\\91846\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		EdgeDriver driver=new EdgeDriver();
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		}

}
