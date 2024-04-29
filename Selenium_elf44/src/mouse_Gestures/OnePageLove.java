package mouse_Gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnePageLove {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://onepagelove.com/");
		Actions actions = new Actions(driver);

		for (;;) {
			try {
				driver.findElement(By.linkText("Design Gifts")).click();
				break;
			} catch (NoSuchElementException e) {
				actions.scrollByAmount(0, 200).perform();
			} catch (ElementClickInterceptedException e) {
				actions.scrollByAmount(0, 100).perform();
				driver.findElement(By.linkText("Design Gifts")).click();
				break;
			}
		}

	}

}
