package lessons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver chrome = new ChromeDriver();
		// chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(5));
		chrome.get("https://www.path2usa.com/travel-companion/");
		// chrome.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) chrome;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/input[@id='form-field-travel_comp_date']")));
		chrome.findElement(By.xpath("//div/input[@id='form-field-travel_comp_date']")).click();
		// check whether the current month is same or not, if not then next month..
		while (!chrome.findElement(By.className("flatpickr-current-month")).getText().contains("August")) {
			chrome.findElement(By.className("flatpickr-next-month")).click();
			Thread.sleep(1000);
		}
		// check whether the day number is same or not, if yes then click on that..
		List<WebElement> daysOfMonth = chrome.findElements(By.cssSelector(".flatpickr-day"));
		int dayCount = daysOfMonth.size();
		for (int i = 0; i < dayCount; i++) {
			WebElement dayOfMonth = chrome.findElements(By.cssSelector(".flatpickr-day")).get(i);
			String dayNumber = dayOfMonth.getText();
			if (dayNumber.equalsIgnoreCase("26")) {
				dayOfMonth.click();
				break;
			}
		}
	}
}

