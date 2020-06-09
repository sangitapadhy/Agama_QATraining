package java_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_chrome {

	public static void main(String[] args) {
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launching the browser 
		driver.get("https://www.Facebook.com");
		//Get the title of the Page
		System.out.println("The Title of the page is "+ driver.getTitle());
		//Close the Page
		//driver.close();

	}

}
