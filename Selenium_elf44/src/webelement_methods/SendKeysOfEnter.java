package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysOfEnter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("bike",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

}
