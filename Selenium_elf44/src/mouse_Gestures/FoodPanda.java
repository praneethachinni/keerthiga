package mouse_Gestures;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FoodPanda {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.foodpanda.com/");
	    List<WebElement> allElements = driver.findElements(By.xpath("//ul[@id='menu-primary']/li[not(contains(.,'Choose location'))]"));
	    Actions actions = new Actions(driver);
		for(WebElement elements:allElements) {
			/*actions.keyDown(Keys.CONTROL).perform();//will open in new tabs--->ctrl+click()
			elements.click();
			actions.keyUp(Keys.CONTROL).perform();*/
			
			actions.keyDown(Keys.SHIFT).perform();//will open in new window--->shift+click()
			elements.click();
			actions.keyUp(Keys.SHIFT).perform();
		}
		Set<String> allwindowid = driver.getWindowHandles();
		for(String windowid :allwindowid) {
			driver.switchTo().window(windowid);
			if(driver.getTitle().contains("panda ads")) {
				driver.close();
				break;
				
			}
		}
		
		

	}

}
