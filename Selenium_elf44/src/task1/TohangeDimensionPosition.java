package task1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohangeDimensionPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91846/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		//String parent = driver.getTitle();
		Thread.sleep(2000);
		//driver.close();
		Set<String> allWindowsId =driver.getWindowHandles();
			for (String windowId : allWindowsId) {
			driver.switchTo().window(windowId);
			Dimension size=new Dimension(500, 500);
			driver.manage().window().setSize(size);
			Thread.sleep(2000);
			Point position=new Point(5,5);
			driver.manage().window().setPosition(position);
			//String title = driver.getTitle();
			/*	
			if(driver.getTitle().contains("Multiple popups")) {
			
			}else 
			{
				driver.close();
			}*/
		
			}
	}

}
