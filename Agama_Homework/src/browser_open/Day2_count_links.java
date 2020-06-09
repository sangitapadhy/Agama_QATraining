package browser_open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_count_links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launching the browser 
		driver.get("https://www.google.com/search?sxsrf=ALeKk01slsLv-P7K97QPHu2xopAFKB4WZw%3A1590703744644&source=hp&ei=gDbQXo2LJKS7ggfwipaYBA&q=testing&oq=testing&gs_lcp=CgZwc3ktYWIQAzICCAAyBQgAEIMBMgIIADICCAAyAggAMgIIADIFCAAQgwEyAggAMgIIADICCAA6BwgjEOoCECc6BAgjECdQpA5YghhguhpoAXAAeACAAXaIAbcEkgEDNi4xmAEAoAEBqgEHZ3dzLXdperABCg&sclient=psy-ab&ved=0ahUKEwiNy46dydfpAhWkneAKHXCFBUMQ4dUDCAk&uact=5");
		
		//driver.get("http://toolsqa.com/");
		// Selenium WebDriver - Count the number of links in a page.

		// use the locator By.tagName and find the elements for the tag //a then use loop to count the number of elements found.
		 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 	 System.out.println(links.size());
		 	 
		 	 for (int i = 0; i<=links.size(); i=i+1)
		 	 
		 	 {
		 	 
		 	 System.out.println(links.get(i).getText());
		 	 
		 	 }
		 	 
		 	 }
		 	 
		 	// List<webElement> link = driver.findElements(By.tagName(“a”));

		 //System.out.println(link.size()); // this will print the number of links in a page. 
	}

