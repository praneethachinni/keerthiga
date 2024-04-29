package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder='search')]"));
		searchBox.clear();
		searchBox.sendKeys("foundation");
		String valueEntered = searchBox.getAttribute("value");
		System.out.println(valueEntered);

	}

}
