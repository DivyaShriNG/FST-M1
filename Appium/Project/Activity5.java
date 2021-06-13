package appium_project_actvities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity5 {
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
	public void login_form() throws InterruptedException{
		//opening chrome
		 driver.get("https://www.training-support.net/selenium/login-form");
		 Thread.sleep(5000);
		 //check if the training support page is opened
		 //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.className("android.widget.Button")));
		 // Scroll to LOGIN_FORM
		 //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingForward().scrollIntoView(textContains(\"Login Form\"))")).click();
		 
		 
		 driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
		 driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
     	 driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.Button").click();
     	 
		 Thread.sleep(10000);
		 
		// assertions
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	WebElement message = driver.findElement(By.xpath("//*[@text='Welcome Back, admin']"));
     	System.out.println(message.getText());
     	Assert.assertEquals(message.getText(), "Welcome Back, admin");
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	
     }
	   @AfterClass
	     public void afterClass() {
	     	driver.quit();
	 
		 }
	}