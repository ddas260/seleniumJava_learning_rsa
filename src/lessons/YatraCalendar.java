package lessons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraCalendar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.yatra.com/");
		chrome.findElement(By.cssSelector("#BE_flight_origin_date")).click();
		Thread.sleep(2000);
		List<WebElement> td = chrome.findElements(By.xpath("//tbody/tr/td"));
		for (int i=0; i<td.size();i++) {
			WebElement data = td.get(i);
			String a = data.getAttribute("data-date");
			if(a!=null) {
				if(a.equalsIgnoreCase("18/02/2024")) {
					data.click();
					break;
				}
			}
		}
	}
}
