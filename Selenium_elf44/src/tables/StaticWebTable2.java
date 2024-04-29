package tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		
		WebElement historicalTable = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//table"));
		 List<WebElement> noofRows = historicalTable.findElements(By.xpath("tbody/tr"));
		 System.out.println(noofRows.size());
		 
		 /*for (int i = 1; i <=10; i++) {
			String details = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//table/tbody/tr["+i+"]/td[1]"))
					.getText();
			String cost = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//table/tbody/tr["+i+"]/td[2]/div[1]"))
					.getText();
			System.out.println(details + " - " + cost);
		}*/
		 
		 for (WebElement row : noofRows) {
				System.out.print(row.findElement(By.xpath("td")).getText() + " - ");
				System.out.println(row.findElement(By.xpath("td[2]/div[1]")).getText());
			}
	}

}
