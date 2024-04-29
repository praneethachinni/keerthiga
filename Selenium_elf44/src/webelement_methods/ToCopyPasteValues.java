package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCopyPasteValues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement firstNameTextBox = driver.findElement(By.id("FirstName"));
		Thread.sleep(2000);
		firstNameTextBox.sendKeys("asdfg");
		Thread.sleep(2000);
		firstNameTextBox.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		firstNameTextBox.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		driver.close();
	}

}
