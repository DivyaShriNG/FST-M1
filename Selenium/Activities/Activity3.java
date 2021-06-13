package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");

		String pageTitle= driver.getTitle();
		System.out.println("Title of the page : "+pageTitle);

		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));

		firstName.sendKeys("Jyoti");
		Thread.sleep(3000);
		lastName.sendKeys("Chavan");

		WebElement email = driver.findElement(By.id("email"));
		WebElement contact = driver.findElement(By.id("number"));

		email.sendKeys("jyoti.chavan@gmail.com");
		Thread.sleep(3000);
		contact.sendKeys("9876543212");

		WebElement submit = driver.findElement(By.className("green"));

		Thread.sleep(3000);
		submit.click();

		driver.quit();

	}

}
