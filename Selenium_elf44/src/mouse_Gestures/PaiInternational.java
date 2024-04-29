package mouse_Gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaiInternational {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		
		WebElement fromEle = driver.findElement(By.xpath("//span[contains(@class,'slider from')]"));
		WebElement toEle = driver.findElement(By.xpath("//span[contains(@class,'slider to')]"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromEle).moveByOffset(30, 0).release().perform();	
		Thread.sleep(2000);
		actions.clickAndHold(toEle).moveByOffset(-60, 0).release().perform();
//		actions.moveToElement(toEle).clickAndHold().moveByOffset(-20, 0).release().perform();

		//actions.dragAndDropBy(fromEle, 30, 0).perform();

	}

}
