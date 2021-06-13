package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		//Open the browser
		driver.get(" https://training-support.net/selenium/dynamic-attributes");

		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);
		
		WebElement username= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		username.sendKeys("admin");
		password.sendKeys("password");
		
		WebElement login= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		
		login.click();
		
		//div[@id='action-confirmation']
		WebElement message= driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		System.out.println("Message is : "+message.getText());
		
		driver.close();
	}

}
