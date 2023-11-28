//Assignment 1: Checkboxes exercise
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Question 1: 
		chrome.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(chrome.findElement(By.id("checkBoxOption1")).isSelected());
		chrome.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(chrome.findElement(By.id("checkBoxOption1")).isSelected());
		//Question 2:
		System.out.println(chrome.findElements(By.cssSelector("[type='checkbox']")).size());
		chrome.quit();
		
		
		

	}

}
