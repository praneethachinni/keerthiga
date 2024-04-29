package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrme.driver","./drivers/chrome driver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("Elf_44_45@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Password123");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
	}

}
