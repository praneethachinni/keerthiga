package mouse_Gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YonosbiPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		WebElement pwdTextBox = driver.findElement(By.id("password"));
		pwdTextBox.sendKeys("23456789");
		Thread.sleep(2000);
		System.out.println(pwdTextBox.getSize().getWidth());
		Actions actions = new Actions(driver);
	    actions.moveToElement(pwdTextBox, 290, 0).click().perform();	
	}

}
