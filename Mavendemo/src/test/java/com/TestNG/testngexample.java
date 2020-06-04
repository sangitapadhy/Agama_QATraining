package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class testngexample {
	
	WebDriver driver;

	@BeforeClass
	public void Setup() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@BeforeMethod
	public void Openurl() {
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test
	public void Login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		}
	@AferMethod
	
	public void postlogout() {
		System.out.println("Title is "+ driver.getTitle());
	}
	@AfterClass
	 public void quit() {
	}
	
	
	}
