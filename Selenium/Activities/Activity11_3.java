package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//Open the browser
		driver.get("https://www.training-support.net/selenium/javascript-alerts");

		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);
		
		WebElement promt=driver.findElement(By.xpath("//button[@id='prompt']"));
		
		promt.click();
		
		Alert promtAlert=driver.switchTo().alert();
		
		System.out.println("Text in alert : "+promtAlert.getText());
		promtAlert.sendKeys("Yes, you are!");
		//Thread.sleep(2000);
		promtAlert.accept();
		//comfirmAlert.dismiss();
		
		driver.close();
	}

}
