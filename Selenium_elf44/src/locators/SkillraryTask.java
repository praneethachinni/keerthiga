package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(20000);
		driver.findElement(By.name("email")).sendKeys("praneethac123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("7396995038");
		driver.findElement(By.name("captcha")).sendKeys("abc");
	}

}
