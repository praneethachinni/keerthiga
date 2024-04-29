package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackToChechColors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.id("Login"));
		System.out.println(loginButton.getCssValue("color"));
	}

}
