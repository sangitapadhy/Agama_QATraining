package com.testcase;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowser {

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.Facebook.com");
		//Get the title of the Page
		System.out.println("The Title of the page is "+ driver.getTitle());
	

	}

}
