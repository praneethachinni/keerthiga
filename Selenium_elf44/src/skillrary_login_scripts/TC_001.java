package skillrary_login_scripts;
/***
 * @author 91846
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Steps to read data form Excel
		File abstractPath = new File("./resources/skillrary_login_TC.xlsx");
		FileInputStream fis = new FileInputStream(abstractPath);
		Workbook workbook = WorkbookFactory.create(fis);
		String emailID = workbook.getSheet("Sheet1").getRow(6).getCell(5).getStringCellValue();
		String password = workbook.getSheet("Sheet1").getRow(8).getCell(5).getStringCellValue();
		
		// Expected Data
		String welcomePageTitle = "";
		String homePageTitle = "";

		// Test step 1 : Open the browser and enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://skillrary.com/");
		String actualWelcomePageTitle = driver.getTitle();
		if (actualWelcomePageTitle.equals(welcomePageTitle)) {
			System.out.println("Welcome page is displayed");
		} else {
			System.out.println("Welcome page is not displayed");
		}

		// Test step 2 : Click on Sign in button
		driver.findElement(By.linkText("SIGN IN")).click();
		if (driver.findElement(By.xpath("//h3[text()='Login']")).isDisplayed()) {
			System.out.println("Sign In page is displayed");
		} else {
			System.out.println("Sign In page is not displayed");
		}
		
		// Test step 3 : Enter given data in email text box
		WebElement emailTextBox = driver.findElement(By.name("email"));
		emailTextBox.clear();
		emailTextBox.sendKeys(emailID);
		String emailEntered = emailTextBox.getAttribute("value");
		if (emailEntered.equals(emailID)) {
			System.out.println("emailId was entered sucessfully");
		} else {
			System.out.println("emailId was not entered sucessfully");
		}
		
		// Test step 4 : Enter given data in password txt field
		WebElement pwdTextBox = driver.findElement(By.name("password"));
		pwdTextBox.clear();
		pwdTextBox.sendKeys(password);
		String pwdEntered = pwdTextBox.getAttribute("value");
		if (pwdEntered.equals(password)) {
			System.out.println("Password was entered sucessfully");
		} else {
			System.out.println("Password was not entered sucessfully");
		}
		
		//Test step 5 : Click on SignIn button
		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
		String actualHomePageTitle = driver.getTitle();
		System.out.println(actualHomePageTitle);
		if (actualHomePageTitle.equals(homePageTitle)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is not displayed");
		}
    }

}
