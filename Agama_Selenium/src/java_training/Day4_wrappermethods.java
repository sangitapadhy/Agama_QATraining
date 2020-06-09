package java_training;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day4_wrappermethods {
		WebDriver driver;
		public void insertapp(String url)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\QA_Agama\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			//Maximize  the window
			driver.manage().window().maximize();
			//Implicit Wait 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
		}

			public void enterbyid(String val,String name)
		{
				driver.findElement(By.id(val)).sendKeys(name);
		}
				
			public void clickbyxpath(String val1)
		{
				driver.findElement(By.xpath(val1)).click();
		}
			public void closeapp() 
		{
				driver.close();
		}
			public void takesnap(String path) throws IOException 
		{
				TakesScreenshot ts =(TakesScreenshot)driver;
			    File source = ts.getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(source,new File((path)));
		}
		
			public void selectdropdown(String text) 
		{
				Select month=new Select(driver.findElement(By.id("month")));
				month.selectByVisibleText(text);
		}
			
	}




