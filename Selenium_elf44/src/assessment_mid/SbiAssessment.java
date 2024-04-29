package assessment_mid;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SbiAssessment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId:allWindowIds) {
		driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click();
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		Dimension size=new Dimension((width+100), (height+100));
		driver.manage().window().setSize(size);
		driver.findElement(By.id("go")).click();
		Alert alert=driver.switchTo().alert();
        String userNameMsg = alert.getText();
        System.out.println(userNameMsg);
        alert.accept();
        driver.findElement(By.id("userName")).sendKeys("chinni");
        driver.findElement(By.id("go")).click();
        String accNo = alert.getText();
        System.out.println(accNo);
        alert.accept();
        driver.findElement(By.id("accountNo")).sendKeys("12");
        driver.findElement(By.id("go")).click();
        String invalidaccNo = alert.getText();
        System.out.println(invalidaccNo);
        alert.accept();
        driver.findElement(By.id("accountNo")).sendKeys("12345678901");
        driver.findElement(By.id("go")).click();
        String country = alert.getText();
        System.out.println(country);
        alert.accept();
        WebElement countryDropdown = driver.findElement(By.id("selCountry"));
        Select drop=new Select(countryDropdown);
        drop.selectByVisibleText("India");
        driver.findElement(By.id("go")).click();
        String mobileNo = alert.getText();
        System.out.println(mobileNo);
        alert.accept();
        WebElement mobileNoTextBox = driver.findElement(By.id("mobileNo"));
        mobileNoTextBox.sendKeys("12345678");
        driver.findElement(By.id("go")).click();
        String invalidmobileNo = alert.getText();
        System.out.println(invalidmobileNo);
        alert.accept();
        mobileNoTextBox.clear();
        mobileNoTextBox.sendKeys("1234567890");
        driver.findElement(By.id("go")).click();
        String dob = alert.getText();
        System.out.println(dob);
        alert.accept();
        driver.findElement(By.name("dob")).sendKeys("08/09/2000");
        driver.findElement(By.id("go")).click();
        String captha = alert.getText();
        System.out.println(captha);
        alert.accept();
        
        driver.findElement(By.id("go")).submit();
        driver.quit();
	}

}
