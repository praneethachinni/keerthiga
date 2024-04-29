package mouse_Gestures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://trello.com/home");
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("username")).sendKeys("praneethakoushik22@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Praneetha@168");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[@title='selenium']")).click();
		WebElement manuallist = driver.findElement(By.linkText("sdlc"));
		Actions actions= new Actions(driver);
		actions.contextClick(manuallist).perform();
		
		 String allValues = driver.findElement(By.xpath("//div[@data-testid='quick-card-editor-buttons']")).getText();
		System.out.println(allValues);

		
		//Thread.sleep(2000);
		//driver.quit();

	}

}
