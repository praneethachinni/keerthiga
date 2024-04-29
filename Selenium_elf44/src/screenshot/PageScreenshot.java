package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScreenshot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://demowebshop.tricentis.com/");
		
		File path = driver.getScreenshotAs(OutputType.FILE);
		Thread.sleep(10000);
		System.out.println(path);
		driver.close();
	}

}
