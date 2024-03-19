package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	WebDriver ldriver;
	
	public AddNewCustomer(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how=How.XPATH, using="//html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	@CacheLookup
	WebElement txttelephoneno;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	@CacheLookup
	WebElement txtsubmit;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdGender.click();
	}
	
	public void custDOB(String mm, String dd, String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custAddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtstate.sendKeys(cstate);	
	}

    public void custPinCode(String pinno)
    {
    	txtpinno.sendKeys(String.valueOf(pinno));
    }
    
    public void custTelephonenum(String ctelephone)
    {
    	txttelephoneno.sendKeys(ctelephone);
    }
    
    public void custEmail(String cemail)
    {
    	txtemailid.sendKeys(cemail);
    }
    
    public void custPassword(String cpassword)
    {
    	txtpassword.sendKeys(cpassword);
    }
    
    public void ClickSubmit()
    {
    	txtsubmit.click();
    }


}
