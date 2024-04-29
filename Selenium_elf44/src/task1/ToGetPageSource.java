package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//File f=new File("task.txt");
		/*File f=new File("task_pagesource.html");
		if (!f.exists()) {
			f.createNewFile();
			System.out.println("file created");
		}
		else {
			System.out.println("file not created");
		}*/
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\91846\\Desktop\\pagesource.txt");
		String pagecode=driver.getPageSource();
		fos.write(pagecode.getBytes());
		}

}
