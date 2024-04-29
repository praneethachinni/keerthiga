package selenium_basics;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowIds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/");
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowid:windowIds)
		System.out.println(windowid);

	}

}
