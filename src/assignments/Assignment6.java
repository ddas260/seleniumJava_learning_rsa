package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement sec1 = chrome.findElement(By.xpath("//div[@class = 'block large-row-spacer'][1]"));
		sec1.findElement(By.xpath("//label[@for = 'bmw']/input[@id = 'checkBoxOption1']")).click();
		String labelText = sec1.findElement(By.xpath("//label[@for = 'bmw']")).getText();
		Select dropdown = new Select(sec1.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(labelText);
		WebElement sec2 = chrome.findElement(By.xpath("//div[@class = 'block large-row-spacer'][2]"));
		sec2.findElement(By.id("name")).sendKeys(labelText);
		sec2.findElement(By.id("alertbtn")).click();
		String alertText = chrome.switchTo().alert().getText();
		if (alertText.contains(labelText)) {
			System.out.println("Option text is present");
		} else {
			System.out.println("Option text is not present");
		}
	}
}
