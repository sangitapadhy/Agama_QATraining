package browser_open;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launching the browser 
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		driver.findElement(By.name("q")).submit();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println("Total numbers of links "+count);
	}


	}

