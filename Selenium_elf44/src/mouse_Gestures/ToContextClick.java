package mouse_Gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToContextClick {

	public static void main(String[] args) {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		WebElement homeAppliances = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		Actions actions=new Actions(driver);
		actions.contextClick(homeAppliances).perform();
		driver.findElement(By.linkText("Robotic Vacuum Cleaners")).click();
	}

}
