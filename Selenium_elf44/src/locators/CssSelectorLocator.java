package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrme.driver","./drivers/chrome driver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

}
