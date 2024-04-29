package task1;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.id("email"));
		//WebElement pwd = driver.findElement(By.id("pass"));
		WebElement pwd = driver.findElement(By.id("passContainer"));
		Point mailloc = mail.getLocation();
		Point pwdloc = pwd.getLocation();
		System.out.println("X value of mail:"+mailloc.getX());
		System.out.println("x value of pwd:"+pwdloc.getX());
		System.out.println(mailloc.getY());
		
		
		if (mailloc.getX()==pwdloc.getX()) {
			System.out.println("alligned towards left");
		}
		else {
			System.out.println("not alligned towards left");
		}
	}

}
