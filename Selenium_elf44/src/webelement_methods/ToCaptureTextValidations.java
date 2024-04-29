package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTextValidations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("abc123@gmail.com");
		WebElement pwdTextBox = driver.findElement(By.id("Password"));
		pwdTextBox.clear();
		pwdTextBox.sendKeys("Pranee@123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(1000);
		String errormsg = driver.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
		System.out.println(errormsg);
	}

}
