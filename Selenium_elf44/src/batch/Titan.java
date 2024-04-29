package batch;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titan {
	public void titan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.get("https://jokerandwitch.com/");
	}

}
