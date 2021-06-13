package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		//open URL
		driver.get("https://www.training-support.net");
		//print title
		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);
		//use findelement by ID
		WebElement locateID= driver.findElement(By.id("about-link"));
		System.out.println("Text in element by ID : "+locateID.getText());
		
		//use findelement by Class name
		WebElement locateClassName= driver.findElement(By.className("green"));
		System.out.println("Text in element by class name : "+locateClassName.getText());
		
		//use findelement by link text
		WebElement locateLinkText= driver.findElement(By.linkText("About Us"));
		System.out.println("Text in element by link text : "+locateLinkText.getText());
				
		//use findelement by css selector
		WebElement locateCSS= driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in element by CSS selector : "+locateCSS.getText());
		
		driver.close();

	}

}
