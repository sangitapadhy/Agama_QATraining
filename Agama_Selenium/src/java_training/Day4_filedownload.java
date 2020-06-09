package java_training;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_filedownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching the browser 
				driver.get("https://www.selenium.dev/");
		//File download		
				driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/a/div/b")).click();
				
				driver.findElement(By.partialLinkText("64 bit Windows IE")).click();
				Thread.sleep(3000);
				File file = new File("C:\\Users\\rwalt\\Downloads\\IEDriverServer_x64_3.150.1.zip");
				boolean check= file.exists();
				System.out.println(check);
				
						
	}

}
