package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshopRegisterLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrme.driver","./drivers/chrome driver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("chinni");
		driver.findElement(By.id("LastName")).sendKeys("praneetha");
		driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pranee@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Pranee@123");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pranee@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
		
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=\"3725955\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("updatecart")).click();
	}

}
