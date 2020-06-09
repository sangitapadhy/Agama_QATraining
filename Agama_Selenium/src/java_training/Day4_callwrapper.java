package java_training;

import java.io.IOException;

public class Day4_callwrapper 
{

	public static void main(String[] args) throws IOException 
	{
		Day4_wrappermethods wm = new Day4_wrappermethods();
		wm.insertapp("https://www.facebook.com/");
		wm.enterbyid("email", "talk2geetu@gmail.com");
		wm.enterbyid("pass", "geetu2384");
		//wm.clickbyxpath("u_0_2");
		wm.clickbyxpath("//*[@id=\'loginbutton\']");
		wm.takesnap("C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\screenshots\\file1.png");
		wm.closeapp();
	}

}


