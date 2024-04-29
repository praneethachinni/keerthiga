package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		WebElement selectPdfFile = driver.findElement(By.id("pickfiles"));
	    selectPdfFile.sendKeys("C:\\Users\\91846\\Desktop\\fileUploadPopUp.pdf");
	}

}
