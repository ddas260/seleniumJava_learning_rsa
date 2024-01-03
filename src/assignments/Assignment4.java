package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome.navigate().to("https://the-internet.herokuapp.com/windows");
		chrome.findElement(By.linkText("Click Here")).click();
		Set<String> windows = chrome.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		chrome.switchTo().window(childWindow);
		String childWindowText = chrome.findElement(By.className("example")).getText();
		System.out.println(childWindowText);
		chrome.switchTo().window(parentWindow);
		String parentWindowText = chrome.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(parentWindowText);
		}

		
	}

