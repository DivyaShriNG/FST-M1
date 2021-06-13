package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		//open URL
		driver.get("https://www.training-support.net");
		//print title
		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);

		WebElement aboutUs = driver.findElement(By.xpath("//a[@id='about-link']"));
		aboutUs.click();
        Thread.sleep(3000);
		System.out.println("Heading is: " + driver.getTitle());

		driver.close();

	}

}
