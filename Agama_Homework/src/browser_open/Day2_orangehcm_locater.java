package browser_open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day2_orangehcm_locater {

	public static void main(String[] args) {
		//To automate orangehcmBrowser (https://opensource-demo.orangehrmlive.com/)
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Launching the browser 
					driver.get("https://opensource-demo.orangehrmlive.com/");
				
				//Get the title of the Page
					System.out.println("The Title of the page is "+ driver.getTitle());
				
				//Username & Password Locater.
					driver.findElement(By.id("txtUsername")).sendKeys("Admin");
					driver.findElement(By.id("txtPassword")).sendKeys("admin123");
					
				//Click- Login using relative x-path
					//driver.findElement(By.id("btnLogin")).click();
					driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
					
				// Click Admin 
					driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
					
				//
				//Close the Page
				//driver.close();

	}

}
