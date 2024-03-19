package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
  @Test
  public void LoginTest() throws IOException
  {
	  driver.get(baseURL);
	 Logger.info("URL is opened");
	 
	 LoginPage lp=new LoginPage(driver);
	 lp.setUserName(username);
	 Logger.info("Entered Username");
	 
	 lp.setPassword(password);
	 Logger.info("Entered Password");
	 
	 lp.clickSubmit();
	 
	 if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	 {
		 captureScreen(driver, "LoginTest");
		 AssertJUnit.assertTrue(true);
		 
		 Logger.info("Login test passed");
	 }
	 else
	 {
		 captureScreen(driver, "LoginTest");
		 AssertJUnit.assertTrue(false);
		 Logger.info("Login test failed");
	 }
	 
	 Assert.assertTrue(true);
	 System.out.println("Done");
	 
  }
}
