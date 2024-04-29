package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingExplicitWaitForDeliveryCheckButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		
		FluentWait fw=new FluentWait(driver).pollingEvery(Duration.ofMillis(100)).withTimeout(Duration.ofMillis(15));
		
		WebDriverWait explicitwait =new WebDriverWait(driver, Duration.ofSeconds(15)); 
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[contains(@alt,'Levis Mens Regular Fit Tee')]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkButton = driver.findElement(By.id("Check"));
		//boolean enabled = checkButton.isEnabled();
		//while (!checkButton.isEnabled()) { }
		
		explicitwait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
	}

}
