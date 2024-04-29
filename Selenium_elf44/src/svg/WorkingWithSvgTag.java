package svg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSvgTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("praneethakoushik22@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pranee@168");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement wishlistElement = driver.findElement(By.xpath("//*[name()='svg' and @id='addToWishlist']"));
		wishlistElement.click();
		String wishlistColor = wishlistElement.getCssValue("fill");
		System.out.println(wishlistColor);
	}

}
