  package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeedTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.speedtest.net/");
		Thread.sleep(4000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='3rd party ad content']"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("cbb")).click();
		driver.switchTo().defaultContent();
	}

}
