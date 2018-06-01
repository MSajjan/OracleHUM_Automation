package com.hum;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class TestHum 
{
	
	 public RemoteWebDriver driver;
	
	  //public WebDriver driver;	
	  
	 /*  @Test
	  public void openMyBlog() 
	  {
	     driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @BeforeClass
	  public void OpenBrowser() 
	  {
	   System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver\\chromedriver.exe");
	   driver = new ChromeDriver();
       driver.manage().window().maximize();
	          
	  }*/
	
	     @Test
		  public void Login()
		    {
		  	  driver.findElement(By.className("android.widget.ImageView")).click();
		  	  driver.findElement(By.className("android.widget.ImageView")).sendKeys("facebook");
		  	     	  
		    }
	      
	      @BeforeClass
		  public void SplashScreen() throws MalformedURLException, InterruptedException
			  {
					  
				  DesiredCapabilities capabilities = new DesiredCapabilities();
				  capabilities.setCapability("Device ID", "372FF67A3B430678"); //obtained from the command "adb devices"
				  capabilities.setCapability("browserName", "Android");
				  capabilities.setCapability(CapabilityType.VERSION, "6.0");
				  capabilities.setCapability("platformName", "Android");
				  capabilities.setCapability("deviceName", "MyName");
				  capabilities.setCapability("appPackage", "com.android.vending");
				  capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
				  capabilities.setCapability("noReset", "true");
	
				  //driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				  
			  }
	 
	      
		      @AfterClass
		      public void end()
		      {
		        driver.quit(); //Close application
		        System.out.println("Successfully Closed the Browser!!");
		      }
	      
	/*  @AfterClass
	  public void afterClass()
	  {
	    driver.quit();
	  }*/

}
