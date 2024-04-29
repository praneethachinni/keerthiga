package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLoginErrormsg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.clear();
		userNameTextBox.sendKeys("abcdef");
		WebElement pwdTestBox = driver.findElement(By.id("password"));
		pwdTestBox.clear();
		pwdTestBox.sendKeys("Abcd@123");
		driver.findElement(By.linkText("Sign in")).submit();
	}

}
