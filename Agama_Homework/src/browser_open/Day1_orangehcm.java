package browser_open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1_orangehcm {

	public static void main(String[] args) {
		//To automate orangehcmBrowser (https://opensource-demo.orangehrmlive.com/)
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//Launching the browser 
				driver.get("https://opensource-demo.orangehrmlive.com/");
				//Get the title of the Page
				System.out.println("The Title of the page is "+ driver.getTitle());
				
				//Close the Page
				//driver.close();
	}

}
