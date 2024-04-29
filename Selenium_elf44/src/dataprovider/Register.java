package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register {
	@DataProvider() 
	public String [][] sendData() throws IOException {
		File abstractPath = new File("./resources/demowebshop_reg.xlsx");
		FileInputStream fis = new FileInputStream(abstractPath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String gen1 = workbook.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
		String fn1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String ln1 = workbook.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String email1 = workbook.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		String pwd1 = workbook.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		String confirm1 = workbook.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
		
		String gen2 = workbook.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		String fn2 = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String ln2 = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String email2 = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String pwd2 = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String confirm2 = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String[][] str= {
				{gen1,fn1,ln1,email1,pwd1,confirm1},
				{gen2,fn2,ln2,email2,pwd2,confirm2}
		};
		
		return str;
		
	}
	
	@Test(dataProvider = "sendData")
	public void toRegister(String[] info) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@value='"+info[0]+"']")).click();
		//driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(info[1]);
		driver.findElement(By.id("LastName")).sendKeys(info[2]);
		driver.findElement(By.id("Email")).sendKeys(info[3]);
		driver.findElement(By.id("Password")).sendKeys(info[4]);
	    driver.findElement(By.id("ConfirmPassword")).sendKeys(info[5]);
		driver.findElement(By.id("register-button")).click();
		 
	}

}
