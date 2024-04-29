package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LogoScreenshot {//web element screenshot

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://demowebshop.tricentis.com/");
		
		File source= driver.findElement(By.xpath("//img[contains(@alt,'Tricentis Demo Web Shop')]")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/logo.png");
		FileHandler.copy(source,destFile);
	}

}
