package svg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgFloridaMap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.get("https://petdiseasealerts.org/forecast-map/#/heartworm-canine/dog/united-states");
		driver.get("https://petdiseasealerts.org/");
		driver.findElement(By.partialLinkText("Go to maps")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		Actions actions = new Actions(driver);
		WebElement florida = driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='florida']"));
		System.out.println(florida.getSize().getWidth());
		System.out.println(florida.getSize().getHeight());
		Thread.sleep(3000);
		actions.moveToElement(florida, 60, 20).click().perform();
		
		String infectionrate = driver.findElement(By.xpath("//span[@class='infection-rate-number']")).getText();
		System.out.println(infectionrate);
		
		driver.quit();
		
	}

}
