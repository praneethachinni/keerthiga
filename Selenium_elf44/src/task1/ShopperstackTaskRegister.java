package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperstackTaskRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Create Account")).click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.id("First Name"));
		firstName.sendKeys("chinni");
		driver.findElement(By.id("Last Name")).sendKeys("praneetha");
		driver.findElement(By.id("Phone Number")).sendKeys("7396995038");
		driver.findElement(By.id("Email Address")).sendKeys("praneethac123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("7396995038");
		driver.findElement(By.id("Confirm Password")).sendKeys("7396995038");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.name("Register")).click();
	}

}
