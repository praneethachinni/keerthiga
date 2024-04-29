package svg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorlingWithSvgMaps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.get("https://petdiseasealerts.org/forecast-map/#/heartworm-canine/dog/united-states");
		driver.get("https://petdiseasealerts.org/");
		driver.findElement(By.partialLinkText("Go to maps")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		List<WebElement> Allstates = driver.findElements(By.xpath(
				"//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='regions' ]//*[name()='g' and @class='region']"));

		for (int i = 0; i < Allstates.size(); i++) {
			try {
				// String Statesnames = Allstates.get(i).getAttribute("id");
				// System.out.println(Statesnames);
				Allstates.get(i).click();

				try {
					String infectionrate = driver.findElement(By.xpath("//span[@class='infection-rate-number']")).getText();
					System.out.println(infectionrate);
				} catch (NoSuchElementException e1) {
					System.out.println("No data");
				}
				driver.findElement(By.linkText("UNITED STATES")).click();

			} catch (ElementNotInteractableException e) {
				System.out.println("Element not present");
				String infectionrate = driver.findElement(By.xpath("//span[@class='infection-rate-number']")).getText();
			}
		}

	}

}
