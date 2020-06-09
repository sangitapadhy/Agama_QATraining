package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusHM {
	
	@Test
	public void login() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("CHE");
		Thread.sleep(1000);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[4]"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
		WebElement b=driver.findElement(By.id("dest"));
		action.moveToElement(b).click().build().perform();
		action.sendKeys("din").perform();
		Thread.sleep(1000);
		WebElement c=driver.findElement(By.xpath("//*[@id=\'search\']/div/div[2]/div/ul/li[3]"));
		Actions action1=new Actions(driver);
		action1.moveToElement(c).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	     driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[2]")).click();
	     Actions action2=new Actions(driver);
			action2.sendKeys(Keys.TAB).perform();
			action2.sendKeys(Keys.ENTER).perform();

}
}
