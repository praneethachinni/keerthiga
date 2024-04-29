package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		WebElement uploadButton = driver.findElement(By.id("resumeUpload"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(uploadButton).scrollByAmount(0, 200).perform();
	    Thread.sleep(2000);	
	    uploadButton.sendKeys("C:\\Users\\91846\\Desktop\\fileUploadPopUp.pdf");
	}

}
