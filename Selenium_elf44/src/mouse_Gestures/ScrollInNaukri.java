package mouse_Gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollInNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		Actions actions=new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Resume writing"));
		ScrollOrigin ref = ScrollOrigin.fromElement(ele);
		actions.scrollFromOrigin(ref, 0, 100).perform();
		ele.click();
		//actions.scrollByAmount(0, 4000).perform();
		//driver.findElement(By.linkText("Resume writing")).click();

	}

}
