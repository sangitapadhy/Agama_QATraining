package java_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_windowsAuthintication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//https://the-internet.herokuapp.com/basic_auth
			 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
