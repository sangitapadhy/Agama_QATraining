package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

public class CallwrapperTestNG {
  
	WebDriver driver;
	WrapperMethod ow = new WrapperMethod();

	@BeforeTest
	 	public void insertapp(){
		ow.insertapp("https://opensource-demo.orangehrmlive.com/");
		}
	
	@Test(priority=1)
		public void login(){
		ow.enterbyid("txtUsername", "Admin");
		ow.enterbyid("txtPassword", "admin123");
		ow.clickbyxpath("//*[@id='btnLogin']");
		}
	
	@Test(priority=2)
		public void admin() throws InterruptedException{
		Thread.sleep(2000);
		ow.clickbyxpath("//*[@id=\'menu_admin_viewAdminModule\']");
		Thread.sleep(2000);
		ow.clickbyxpath("//*[@id=\'menu_admin_UserManagement\']");
		Thread.sleep(2000);
		ow.enterbyid("searchSystemUser_userName", "Sangita");
		Thread.sleep(2000);
		ow.clickbyxpath("//input[@id='searchBtn']");
		ow.selectdropdown("searchSystemUser_userType","Admin");
		ow.enterbyid("searchSystemUser_employeeName_empName", "Sangita Padhy");
		ow.selectdropdown("searchSystemUser_status","Enabled");
		ow.clickbyxpath("//*[@id=\'searchBtn\']");//Click search
		}

	@AfterTest
	public void quit()
	{
		ow.closeapp();
	}

	
}
