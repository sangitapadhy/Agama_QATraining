package com.testcase;

import java.io.IOException;

public class CallWraper {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WrapperMethod wm = new WrapperMethod();
		//Automating PIM Module of OrangeHrm Webpage
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id=\"btnLogin\"]");
		Thread.sleep(1000);
		wm.clickbyxpath("/html/body/div[1]/div[2]/ul/li[2]/a/b");
		Thread.sleep(1000);
		wm.clickbyxpath("//*[@id=\'menu_pim_addEmployee\']");
		Thread.sleep(1000);
		wm.enterbyid("firstName", "John");
		wm.enterbyid("middleName", "S");
		wm.enterbyid("lastName", "Tad");
		wm.Fileupload("photofile", "C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\screenshots\\robox.png");
		wm.clickbyxpath("//*[@id=\'btnSave\']");
		Thread.sleep(1000);
		wm.takesnap("C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\screenshots\\orange5.png");

	}
}
