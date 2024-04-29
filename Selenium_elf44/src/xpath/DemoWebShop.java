package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fiction']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Health Book']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping cart")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//a[text()='Computing and Internet']/../..//td[4]/span[2]"));
		
		for(WebElement price:prices) {
			String cost = price.getText();
			System.out.println(cost);
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
