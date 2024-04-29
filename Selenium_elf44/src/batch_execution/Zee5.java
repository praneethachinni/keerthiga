package batch_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zee5 {
	@Test
	public void boat() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.zee5.com/");
	}
}
