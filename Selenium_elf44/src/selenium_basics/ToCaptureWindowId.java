package selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	}

}
