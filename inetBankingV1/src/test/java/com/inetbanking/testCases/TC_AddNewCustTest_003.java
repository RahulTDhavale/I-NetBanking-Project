package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomer;
import com.inetbanking.pageObjects.LoginPage;


public class TC_AddNewCustTest_003 extends BaseClass
{
	
	
  @Test
  public void AddNewCust() throws InterruptedException, IOException
  {
	  

	  LoginPage lp=new LoginPage(driver);
	  lp.setUserName(username);
	  lp.setPassword(password);
	  lp.clickSubmit();
	  
	  Thread.sleep(3000);
	  
	  AddNewCustomer ac=new AddNewCustomer(driver);
	  ac.clickAddNewCustomer();
	  
	  ac.custName("Rahul");
	  ac.custGender("male");
	  ac.custDOB("11", "12", "1995");
	  
	  Thread.sleep(3000);
	  
	  ac.custAddress("INDIA");
	  ac.custCity("Pune");
	  ac.custState("MAH");
	  ac.custPinCode("101010");
	  ac.custTelephonenum("9874563210");
	  
	  Thread.sleep(3000);
	  
	  String email=randomString()+"@gamil.com";
	  ac.custEmail(email);
	  ac.custPassword("abscde");
	  ac.ClickSubmit();
	  
	  Thread.sleep(3000);
	  
	  boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	  
	  if(res==true)
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  captureScreen(driver, "addNewCustomer");
		  Assert.assertTrue(false);
	  }
	  
  }
  
  public String randomString()
  {
	  String generatedString=RandomStringUtils.randomAlphabetic(8);
	  return(generatedString);
  }
}
