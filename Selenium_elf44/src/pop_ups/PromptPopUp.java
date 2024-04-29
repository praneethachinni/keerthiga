package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
       WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
       tryIt.click();
        //Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        String msg = alert.getText();
        System.out.println(msg);
        alert.sendKeys("praneetha");
        alert.accept();
        Thread.sleep(2000);
        //tryIt.click();
       // alert.dismiss();
	}

}
