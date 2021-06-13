package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions actions=new Actions(driver);
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//Open the browser
		driver.get("https://www.training-support.net/selenium/input-events");

		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);

		WebElement cube= driver.findElement(By.id("D3Cube"));
		//left click    
		actions.click(cube);
		WebElement cubeVal = driver.findElement(By.className("active"));
		System.out.println("Left Click: " + cubeVal.getText());
		//Double click
		actions.doubleClick(cube).perform();
		cubeVal = driver.findElement(By.className("active"));
		System.out.println("Double Click: " + cubeVal.getText());  


		//Right click        
		actions.contextClick(cube).perform();
		cubeVal = driver.findElement(By.className("active"));
		System.out.println("Right Click: " + cubeVal.getText());

		//Close browser
		driver.close();

	}

}
