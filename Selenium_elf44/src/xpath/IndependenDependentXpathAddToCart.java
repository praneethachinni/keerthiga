package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependenDependentXpathAddToCart {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
			driver.get("https://www.purplle.com/");
			driver.findElement(By.xpath("//div[contains(text(),'Good Vibes Cherry Moisture Rich Red Tinted Lip Balm SPF 1')]/..//a[contains(text(),'Add to Cart ')]")).click();
	}

}
