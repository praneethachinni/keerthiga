package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com");
		Thread.sleep(2000);
		/*driver.findElement(By.partialLinkText("SPANISH")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//button[text()='Sign-Up']")).submit();
		WebElement errormsg = driver.findElement(By.id("first_name-error"));
		System.out.println(errormsg.getCssValue("color"));
	}

}
