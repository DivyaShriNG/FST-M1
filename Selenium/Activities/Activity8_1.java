package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		//Open the browser
		driver.get("https://training-support.net/selenium/tables");

		/*
		 * String pageTitle= driver.getTitle();
		 * System.out.println("Title of the page is : "+pageTitle);
		 */
		
		 //Get columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        //Get rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
 
        //Number of columns
        System.out.println("Number of columns are: " + cols.size());
        //Number of rows
        System.out.println("Number of rows are: " + rows.size());
 
        //Get third row values and print them
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }
 
        //Cell value of second row, second column
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
 
        //Close browser
        driver.close();
	}

}
