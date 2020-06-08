package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehandling {
	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Get the title of the Page
		System.out.println("The Title of the page is "+ driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
		//driver.findElement(By.id("menu_admin_Job")).click();
		//Mouse Click Demo 
		WebElement a = driver.findElement(By.id("menu_admin_Job"));
		WebElement b = driver.findElement(By.id("menu_admin_employmentStatus"));
		Actions action = new Actions(driver);
		action.moveToElement(a).perform();
		action.moveToElement(b).click().build().perform();
		
	}
	
	

}
