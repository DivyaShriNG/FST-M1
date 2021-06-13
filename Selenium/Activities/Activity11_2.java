package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new FirefoxDriver();
				//WebDriverWait wait= new WebDriverWait(driver, 10);
				//Open the browser
				driver.get("https://www.training-support.net/selenium/javascript-alerts");

				String pageTitle= driver.getTitle();
				System.out.println("Title of the page is : "+pageTitle);
				
				WebElement confirm=driver.findElement(By.xpath("//button[@id='confirm']"));
				
				confirm.click();
				
				Alert comfirmAlert=driver.switchTo().alert();
				
				System.out.println("Text in alert : "+comfirmAlert.getText());
				
				comfirmAlert.accept();
				//comfirmAlert.dismiss();
				
				driver.close();
	}

}
