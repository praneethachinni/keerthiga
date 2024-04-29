package listboxOrDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiListBox = driver.findElement(By.id("cars"));
		Select courseByPriceSelect = new Select(multiListBox);
		
		courseByPriceSelect.selectByIndex(1);
		Thread.sleep(2000);
		courseByPriceSelect.selectByValue("299");
		Thread.sleep(2000);
		courseByPriceSelect.selectByVisibleText("Free ( 90 )");
		Thread.sleep(2000);
		System.out.println(courseByPriceSelect.getFirstSelectedOption().getText());
		
		courseByPriceSelect.deselectByIndex(0);
		Thread.sleep(2000);
		courseByPriceSelect.deselectByValue("99");
		Thread.sleep(2000);
		courseByPriceSelect.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
		
		for (int i = 0; i <3; i++) {
			courseByPriceSelect.selectByIndex(i);
			Thread.sleep(1000);
		}
		
	    List<WebElement> alloptions = courseByPriceSelect.getAllSelectedOptions().
		for(WebElement option:alloptions) {
			
		}
		courseByPriceSelect.deselectAll();
		
		
		
		
		
		
		
		
	}

}
