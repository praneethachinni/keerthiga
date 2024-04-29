package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurpleAddCartRemoveLowPriceItem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.purplle.com/");
		Thread.sleep(20000);
		
		//driver.findElement(By.partialLinkText("Lakme 9 To 5 Weightless Mousse Foundation - Beige Vanilla 02 (6 g)")).click();
		//driver.findElement(By.partialLinkText("SHOP CATEGORIES)")).click();
		//driver.findElement(By.linkText("Add to Cart")).click();
		//driver.findElement(By.id("header-cartcount")).click();
		//Thread.sleep(2000);
	}

}
