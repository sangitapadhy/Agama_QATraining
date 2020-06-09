package java_training;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_4_fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Maximize  the window
		driver.manage().window().maximize();
		
		System.out.println("stop");
		
		//Launching the browser 
		driver.get("https://filebin.net/");
		//File Upload
		driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\selenium_upload.txt");
		
	}

}
