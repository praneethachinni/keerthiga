package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingImplicitWaitForDeliveryCheckButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[contains(@alt,'Levis Mens Regular Fit Tee')]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkButton = driver.findElement(By.id("Check"));
		//boolean enabled = checkButton.isEnabled();
		while (!checkButton.isEnabled()) { }
			checkButton.click();
	}

}
