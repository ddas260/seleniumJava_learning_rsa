package lessons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome.get("https://www.path2usa.com/travel-companion/");
		chrome.findElement(By.id("form-field-travel_comp_date")).click();
		
		

	}

}
