package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Log in']/..")).isEnabled());
	}//or in xpath "//button[.='Log in']"

}
