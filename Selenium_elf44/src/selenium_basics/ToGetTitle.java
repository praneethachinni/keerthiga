package selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
