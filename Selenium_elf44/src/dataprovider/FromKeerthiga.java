package dataprovider;
    import java.io.File;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class FromKeerthiga {
		@DataProvider //(parallel=true)
		public String[][] RegistrationData() throws IOException {
			
			File path = new File("./Resources/DemoWebShopRegistration.xlsx");		
			FileInputStream fis = new FileInputStream(path);
			
			Workbook workbook = WorkbookFactory.create(fis);
			
			String gen1 = workbook.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
			String gen2 = workbook.getSheet("Sheet1").getRow(2).getCell(5).getStringCellValue();
			
			String fn1 = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			String fn2 = workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();

			String ln1 = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
			String ln2 = workbook.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
			
			String email1 = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
			String email2 = workbook.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
			
			String pass1 = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
			String pass2 = workbook.getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
			
			String cpass1 = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
			String cpass2 = workbook.getSheet("Sheet1").getRow(2).getCell(4).getStringCellValue();
			
			String[][] data= {
					{gen1,fn1,ln1,email1,pass1,cpass1},
					{gen2,fn2,ln2,email2,pass2,cpass2},
				
			};
			
			return data;	
	}
		@Test(dataProvider="RegistrationData")
		public void Register(String[] datas) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/register");
			
			driver.findElement(By.xpath("//input[@value='"+datas[0]+"']")).click();
			driver.findElement(By.id("FirstName")).sendKeys(datas[1]);
			driver.findElement(By.id("LastName")).sendKeys(datas[2]);
			driver.findElement(By.id("Email")).sendKeys(datas[3]);
			driver.findElement(By.id("Password")).sendKeys(datas[4]);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(datas[5]);
			
			driver.findElement(By.id("register-button")).click();
		}
	}

