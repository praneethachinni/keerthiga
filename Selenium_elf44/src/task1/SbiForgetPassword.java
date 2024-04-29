 package task1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiForgetPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		Thread.sleep(3000);
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId:allWindowIds) {
		driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("chinni");
		driver.findElement(By.id("accountNo")).sendKeys("123456789012");
		driver.findElement(By.id("mobileNo")).sendKeys("1234567890");
		driver.findElement(By.name("dob")).sendKeys("08/09/2000");
		driver.findElement(By.name("captchaValue")).sendKeys("asdf");
		driver.findElement(By.id("go")).submit();//(or)click();
	}

}
