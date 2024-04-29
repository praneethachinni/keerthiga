package mouse_Gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
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
		WebElement source = driver.findElement(By.linkText("sdlc"));
		WebElement target = driver.findElement(By.xpath("//h2[text()='selenium']/../../..//button[text()='Add a card']"));
		Actions actions= new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

}
