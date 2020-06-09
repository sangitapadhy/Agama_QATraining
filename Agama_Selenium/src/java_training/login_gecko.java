package java_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_gecko {
	public static void main(String[] args) {
		//To automate Firefox Browser
			System.setProperty("webdriver.gecko.driver", "D:\\QA_Agama\\Softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//Launching the browser 
			driver.get("https://www.google.com");
			//Get the title of the Page
			System.out.println("The Title of the page is "+ driver.getTitle());
			//Close the Page
			driver.close();

	}

}
