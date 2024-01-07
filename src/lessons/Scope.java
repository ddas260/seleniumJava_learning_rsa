package lessons;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//1. give me the count of links on the page
		int allLinkCount = chrome.findElements(By.tagName("a")).size();//finding all web elements by anchor tag
		System.out.println("Total links present on the page:"+allLinkCount); 
		//2. give me the count of links on the page footer section
		WebElement footerDriver = chrome.findElement(By.id("gf-BIG"));//limiting web driver scope
		int footerLinkCount = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("Total links present on the page footer:"+footerLinkCount);
		//3. give me the count of links on the page footer section 1st column
		WebElement footerColumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int footerColumnLinkCount = footerColumnDriver.findElements(By.tagName("a")).size();
		System.out.println("Total links present on the page footer 1st column:"+footerColumnLinkCount);
		//4. click on each link (except the first one) in the column and check if the pages are opened and after opening get the window titles
		for (int i = 1; i < footerColumnLinkCount; i++) {
			WebElement link = footerColumnDriver.findElements(By.tagName("a")).get(i);
			System.out.println(link.getText());
			String ctrl = Keys.chord(Keys.CONTROL,Keys.ENTER);
			link.sendKeys(ctrl);
		}
		Set<String> tabs = chrome.getWindowHandles();
		System.out.println(tabs); //to print all tab Ids
		Iterator<String> iterateTabs = tabs.iterator();
		while(iterateTabs.hasNext()) {
			chrome.switchTo().window(iterateTabs.next());
			System.out.println(chrome.getTitle());
		}
	}
}
