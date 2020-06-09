package browser_open;

import java.io.IOException;

public class Day3_callwrapper {

	public static void main(String[] args) throws IOException 
	{
		Day3_wrappermethods wm = new Day3_wrappermethods();
		//Automating Admin Page of Orangehrmlive browser
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");	//Launching webbrowser
		wm.enterbyid("txtUsername", "Admin"); //Click Username
		wm.enterbyid("txtPassword", "admin123");//Click Password
		wm.clickbyxpath("//*[@id=\"btnLogin\"]");//Click login 
		wm.takesnap("C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\screenshots\\Orangehrm1.png"); //Take screenshot 
		wm.clickbyxpath("//*[@id=\'menu_admin_viewAdminModule\']/b");//Click Admin Module
		wm.enterbyid("searchSystemUser_userName","Sangita"); //Submit username
		wm.selectdropdown("searchSystemUser_userType","Admin");// submit userRole using dropdown
		wm.enterbyid("searchSystemUser_employeeName_empName", "Sangita Padhy");//Employee Name
		wm.selectdropdown("searchSystemUser_status","Enabled");//Status using dropdown
		wm.clickbyxpath("//*[@id=\'searchBtn\']");//Click search
		wm.takesnap("C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\screenshots\\Orangehrm2.png");//Take Screenshot
		//wm.closeapp();
	}

}
