package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("SPANISH")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SIGN IN")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("praneethac123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("7396995038");
		driver.findElement(By.name("captcha")).sendKeys("abc");
		driver.findElement(By.id("usertype_yes")).click();
		driver.findElement(By.id("groupcode")).sendKeys("TYSS123");
		driver.findElement(By.name("remember")).click();
	}

}
