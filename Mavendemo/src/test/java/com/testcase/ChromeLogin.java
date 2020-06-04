package com.testcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLogin {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); //no need to update the driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		System.out.println("The Title of the page is "+ driver.getTitle());
		driver.close();

	}

}
