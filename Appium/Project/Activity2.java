package appium_project_actvities;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.net.URL;
//import java.util.List;

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

public class Activity2 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    
@BeforeClass
 public void setupMobile() throws InterruptedException, IOException {
		// Set the Desired Capabilities
		  DesiredCapabilities caps = new DesiredCapabilities();
				 caps.setCapability("deviceName", "Pixel_4_Emulator");
		  		 caps.setCapability("platformName", "android");
		         caps.setCapability("automationName", "UiAutomator2");
		         caps.setCapability("appPackage", "com.google.android.keep");
		         caps.setCapability("appActivity", "com.google.android.apps.keep.ui.activities.BrowseActivity");
		         caps.setCapability("noReset", "true");
		         
		         
		         //Instantiate Appium Driver
		         URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		         driver = new AndroidDriver<MobileElement>(appServer, caps);
		         wait = new WebDriverWait(driver, 10);
		     }
	 @Test
	public void addNote() {
		 //adding new note
		 wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
		 driver.findElementByAccessibilityId("New text note").click();
		 
		 //adding title
		 wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
		 driver.findElementById("editable_title").sendKeys("Adding first note text");
		 //adding description
		 driver.findElementById("edit_note_text").sendKeys("This is my first note on the emulator");
		
		 //back button
		 driver.findElementByAccessibilityId("Navigate up").click();
		 
		 //Assertion
		 MobileElement notename= driver.findElementById("index_note_text_description");
		 assertEquals(notename.getText(),"This is my first note on the emulator");
		 
		 //wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("index_note_text_description"), 3));
		 //List<MobileElement> notename= driver.findElementsById("index_note_text_description");
		 //assertEquals(notename.get(0).getText(),"This is my first note on the emulator");
	 }
	@AfterClass
	public void close() {
		driver.quit();
	}
}
