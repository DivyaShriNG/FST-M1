package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		//open URL
		driver.get("https://www.training-support.net/selenium/simple-form");
		//print title
		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);

		WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

		firstName.sendKeys("Jyoti");
		lastName.sendKeys("Chavan");

		//Enter the email
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("jyoti.chavan@gmail.com");

		//Enter the contact number
		driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");

		//Enter Message
		driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

		//Click Submit
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		
		//driver.close();

	}

}
