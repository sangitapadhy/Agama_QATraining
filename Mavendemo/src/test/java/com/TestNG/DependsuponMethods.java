package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsuponMethods {
	@Test()
	  public void login() {
	  System.out.println("Login");
	  }
	  @Test(dependsOnMethods ="login")
	  public void search() {
	  System.out.println("Search");
	  System.out.println("Test");
	  Assert.assertEquals("xyz","xyz"); //this will pass
	 // Assert.assertEquals("xyz","abc"); //this will fail
	 }
	  @Test (dependsOnMethods ="search", alwaysRun=true)
	  public void logout() {
	  System.out.println("Logout");
	 }
}

