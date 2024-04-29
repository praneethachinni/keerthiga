package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_BrowserActions {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.co.in");
		
		//FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.co.in");
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in");
		
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.co.in");
	}

}
