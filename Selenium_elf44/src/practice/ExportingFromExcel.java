package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExportingFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize(); 
	    
	    driver.get("https://www.ixigo.com/"); 
	    
		File file = new File("./resources/cities.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis); 
		
	    String source =workbook.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue(); 
	    String destination =workbook.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	    
		driver.findElement(By.xpath("//label[text()='From']")).sendKeys(source);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='To']")).sendKeys(destination);
		driver.findElement(By.xpath("//button[text()='Search']")).click();

		Thread.sleep(3000);
		driver.close();
		
	}

}
