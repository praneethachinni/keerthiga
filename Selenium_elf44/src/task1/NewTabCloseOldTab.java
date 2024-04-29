package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabCloseOldTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.in/");
		Thread.sleep(3000);
		String maybellineID = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Men")).click();
		driver.switchTo().window(driver.getWindowHandle());
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Careers")).click();
		Thread.sleep(3000);
		driver.switchTo().window(maybellineID);
		Thread.sleep(3000);
		driver.close();
		}

}
