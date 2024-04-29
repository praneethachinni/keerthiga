package listboxOrDropdown;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodDropdownSelectLastOption {
	
	public static void dropdown(WebElement drop) {
		Select courseByPriceSelect = new Select(drop);
		List<WebElement> allOptions = courseByPriceSelect.getOptions();
		courseByPriceSelect.selectByIndex(allOptions.size()-1);
		//String text = courseByPriceSelect.getFirstSelectedOption().getText();
		//System.out.println(text);
	}

	public static void main(String[] args) {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement multiListBox = driver.findElement(By.id("cars"));
		//Select courseByPriceSelect = new Select(multiListBox);
		WebElement selectCategoryDropdown = driver.findElement(By.name("addresstype"));
		
		dropdown(selectCategoryDropdown);
		//dropdown(multiListBox);
		
	}

}
