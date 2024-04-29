package till_frames;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TaskOnRedIffMail {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).submit();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.linkText("New Mail")).click();
		driver.findElement(By.xpath("//label[text()='To:']")).click();
		driver.findElement(By.xpath("//input[@value='sumanthElfBatch@rediffmail.com']/../..//input[@id='rd_chk_cmp2to0']")).click();
		driver.findElement(By.xpath("(//span[text()='Done'])[2]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'rd_inp_sub rd_subject_datacmp2')]")).sendKeys("praneetha");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("good morning");
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Send")).click();
		
		File source = driver.findElement(By.xpath("//div[text()='Your mail has been sent']")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./sent_mail_msg/sentmsg.png");
		FileHandler.copy(source,destFile);
		driver.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
		driver.findElement(By.xpath("//span[@title='praneetha']/..//cite[@title='Select mail']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		driver.manage().
		
		
		File del_msg = driver.findElement(By.xpath("//div[@class='rd_header']")).getScreenshotAs(OutputType.FILE);
		File del_File = new File("./sent_mail_msg/delmsg.png");
		FileHandler.copy(del_msg,del_File);
		//Thread.sleep(5000);
		driver.close();
	}

}
