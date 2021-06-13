package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		//open URL
		driver.get("https://training-support.net/selenium/dynamic-controls");
		//print title
		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);

		WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);

		System.out.println("Checkbox selected on the page : "+checkbox.isSelected());

		checkbox.click();

		Thread.sleep(2000);
		System.out.println("Checkbox selected on the page : "+checkbox.isSelected());

		driver.close();


	}

}
