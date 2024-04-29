package workingIhidden_and_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionsOnHiddenTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://facebook.com/signup");
		WebElement hiddenTextBox = driver.findElement(By.name("custom_gender"));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].value='Data entered';", hiddenTextBox);
	}

}
