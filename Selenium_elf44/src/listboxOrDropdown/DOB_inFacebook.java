package listboxOrDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB_inFacebook {

	public static void main(String[] args) {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(day);
		Select monthSelect = new Select(month);
		Select yearSelect = new Select(year);
		
		System.out.println(daySelect.isMultiple());//false
		
		daySelect.selectByIndex(7);//8
		monthSelect.selectByValue("8");//sep
		yearSelect.selectByVisibleText("2000");//2000
	}

}
