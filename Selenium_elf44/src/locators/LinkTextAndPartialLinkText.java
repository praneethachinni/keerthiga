package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Dining & Kitchen")).click();
		//driver.findElement(By.partialLinkText("Modular Kitchen")).click();
          driver.findElement(By.linkText("Modular Kitchen")).click();
	}

}
