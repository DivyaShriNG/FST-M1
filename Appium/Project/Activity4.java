package appium_project_actvities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    
@BeforeClass
 public void setupMobile() throws InterruptedException, IOException {
		// Set the Desired Capabilities
		  DesiredCapabilities caps = new DesiredCapabilities();
				 caps.setCapability("deviceName", "Pixel_4_Emulator");
		  		 caps.setCapability("platformName", "android");
		         caps.setCapability("automationName", "UiAutomator2");
		         caps.setCapability("appPackage", "com.android.chrome");
		         caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		         caps.setCapability("noReset", "true");
		         
		               
		         //Instantiate Appium Driver
		         URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		         driver = new AndroidDriver<MobileElement>(appServer, caps);
		         wait = new WebDriverWait(driver, 10);
		         
		     }
	 @Test
	public void To_do_list() throws InterruptedException{
		//opening chrome
		 driver.get("https://www.training-support.net/selenium");
		 //check if the training support page is opened
		 wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.className("android.widget.Button")));
		 // Scroll to To-Do List
		 driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingForward().scrollIntoView(textContains(\"To-Do List\"))")).click();
		 Thread.sleep(3000);
	     
	     //Adding task in To-do-list
			
			  String[] tasks_add = {"Add tasks to list", "Get number of tasks","Clear the list"};
			  
			  for(String task : tasks_add) {
		        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys(task);
		        					
		        	driver.findElementByXPath("//android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
		        	}		
		        
			 	
	        	//--Strike out each task
	        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[2]/android.view.View").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[3]/android.view.View").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[4]/android.view.View").click();
	        
	        	//-- Clear All Task
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]").click();
	        }
	        
	         @AfterClass
     public void afterClass() {
     	driver.quit();
 
	 }
}


	 