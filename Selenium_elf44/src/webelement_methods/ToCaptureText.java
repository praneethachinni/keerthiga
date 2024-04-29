package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("abc123");
		driver.findElement(By.id("Password")).sendKeys("Pranee@123");
		 String errormsg = driver.findElement(By.cssSelector("span[for='Email']")).getText();
		System.out.println(errormsg);

	}

}
