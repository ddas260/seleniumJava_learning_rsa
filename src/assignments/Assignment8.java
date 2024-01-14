package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement searchBox = chrome.findElement(By.cssSelector("input[id='autocomplete']"));
		searchBox.sendKeys("ind");
		List<WebElement> results = chrome.findElements(By.cssSelector(".ui-menu-item"));
		for (int i = 0; i < results.size(); i++) {
			WebElement result = results.get(i);
			String text = result.getText();
			if (text.equalsIgnoreCase("India")) {
				result.click();
				break;
			}
		}
		System.out.println(searchBox.getAttribute("value"));
	}
}

