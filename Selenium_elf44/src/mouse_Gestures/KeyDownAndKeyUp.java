package mouse_Gestures;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndKeyUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://parivahan.gov.in/parivahan/");
		List<WebElement> allNavEle = driver.findElements(By.xpath("//li[@data-level='1']"));
		Actions actions = new Actions(driver);
		for(WebElement navEle:allNavEle) {
			/*actions.keyDown(Keys.CONTROL).perform();//will open in new tabs--->ctrl+click()
			navEle.click();
			actions.keyUp(Keys.CONTROL).perform();*/
			
			actions.keyDown(Keys.SHIFT).perform();//will open in new window--->shift+click()
			navEle.click();
			actions.keyUp(Keys.SHIFT).perform();
		}
		
		String pid = driver.getWindowHandle();
		//driver.switchTo().window(pid);
		//String idOfExternalLinks = driver.getWindowHandle();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			if (windowId==pid) {
				driver.close();
			}
		}
	}

}
