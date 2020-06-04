package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test(groups= {"smoketesting","sanitytesting"})
	  public void login() {
	  System.out.println("Login");
	  }
	  
	@Test(groups= {"smoketesting","regressiontesting"})
	  public void search() {
	  System.out.println("Search");
	 // Assert.assertEquals("xyz","xyz"); //this will pass
	  Assert.assertEquals("xyz","abc"); //this will fail
	 }
	  @Test (groups= {"regressiontesting","functionaltesting"})
	  public void logout() {
	  System.out.println("Logout");
	 }
}
