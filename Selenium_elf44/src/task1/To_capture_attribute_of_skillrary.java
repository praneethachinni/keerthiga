package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_capture_attribute_of_skillrary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(2000);
		
		//getting value
		WebElement emailtextbox = driver.findElement(By.id("email"));
		emailtextbox.clear();
		emailtextbox.sendKeys("abc@gmail.com");
		String valueentered = emailtextbox.getAttribute("value");
		System.out.println(valueentered);

	}

}
