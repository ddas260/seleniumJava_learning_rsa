package lessons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver chrome = new ChromeDriver();
		//chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(5));
		chrome.get("https://www.path2usa.com/travel-companion/");
		//chrome.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)chrome;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/input[@id='form-field-travel_comp_date']")));
		chrome.findElement(By.xpath("//div/input[@id='form-field-travel_comp_date']")).click();
		
		

	}

}
