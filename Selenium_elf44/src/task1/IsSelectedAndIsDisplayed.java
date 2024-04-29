package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedAndIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(3000);
		boolean flag = driver.findElement(By.id("usertype_yes")).isSelected();
		//System.out.println(flag);
		if(flag==true) {
			System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
		}
		else {
			System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
		}
		
		boolean flag2 = driver.findElement(By.id("usertype_no")).isSelected();
		//System.out.println(flag2);
		if(flag2==true) {
			System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
		}
		else {
			System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
		}
	}

}
