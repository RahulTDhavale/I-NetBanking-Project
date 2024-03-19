package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;



public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	
	
	public String baseURL= readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger Logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{

		 Logger = Logger.getLogger("ebanking");
		 PropertyConfigurator.configure("log4j.properties");
		 
		 if(br.equals("chrome"))
		 {
		  System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
		 }
		 else if(br.equals("firefox"))
		 {
		   System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		 }
		 else if(br.equals("edge"))
		 {
		   System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
			driver = new EdgeDriver();
		 }
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 
		  
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File target=new File(System.getProperty("user,dir")+"/Screenshots/"+tname+".png");
		
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}

}
