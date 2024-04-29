package pop_ups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileIUploadAutoit {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.get("https://www.totaljobs.com/account/register"); 
		driver.findElement(By.xpath("//div[text()='Accept All']")).click();
		driver.findElement(By.id("btnCVUpload")).click();
		driver.findElement(By.xpath("//label[text()='from this device']")).click();
		
		Runtime.getRuntime().exec("./autoIT_scripts/TotalJobsFileUpload.exe");
	}

}
