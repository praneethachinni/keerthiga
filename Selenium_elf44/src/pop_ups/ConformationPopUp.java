package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://licindia.in/");
        driver.findElement(By.xpath("//button[text()='Close']")).click();
        driver.findElement(By.partialLinkText("Pay Premium")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        String msg = alert.getText();
        System.out.println(msg);
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Pay Premium")).click();
        alert.dismiss();
	}

}
