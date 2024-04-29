package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTrip {

	private static ChromeDriver chromeDriver;

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize(); 
	    
	    driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("cleartrip");
	    Actions actions=new Actions(driver);
	    actions.keyDown(Keys.ENTER).perform();
	    actions.keyUp(Keys.ENTER).perform();
	    Thread.sleep(7000);
	    
	    driver.findElement(By.xpath("//span[text()='Cleartrip™ Official Site | Lowest Flight Fares in India']")).click();
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
        
	    File file = new File("./resources/cities.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis); 
		
	    String source =workbook.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue(); 
	    String destination =workbook.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	    
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys(source);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HYD']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys(destination);
		driver.findElement(By.xpath("//div[text()='BOM']")).click();
		
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		//driver.findElement(By.xpath("//div[text()='"+(date+1)+"'"]));
		LocalDateTime ldt=LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		System.out.println(date);
		
		
		driver.findElement(By.xpath("//span[text()='Search flights']")).click();
	    
	}

}
