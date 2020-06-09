package java_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//To automate orangehcmBrowser (https://opensource-demo.orangehrmlive.com/)
				//Chrome Browser
						System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						//Launching the browser 
							driver.get("https://www.facebook.com/");
						//Get the title of the Page
							//System.out.println("The Title of the page is "+ driver.getTitle());
						//1.ID
							//driver.findElement(By.id("email")).sendKeys("abc.gmail.com");
							//driver.findElement(By.id("pass")).sendKeys("g123");
							
						//2.Relative X-path
							//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
							
						//Absolute X-Path
							//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
							
						//3.Link Text 
							//driver.findElement(By.linkText("Forgot account?")).click();
							
						//4.Partial link text
							//driver.findElement(By.partialLinkText("Forgot")).click();
							
						//5.And Condition
							driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("aaa");
							
						//6.OR Condition 
							driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_s']")).sendKeys("bbb");
						//Contains
							driver.findElement(By.xpath("//*[contains(@name,'reg_email__')]")).sendKeys("123456789");
						//Startswith
							driver.findElement(By.xpath("//*[starts-with(@name,'reg_p')]")).sendKeys("1234");
						//Close the Page
						//driver.close()

	}

}
