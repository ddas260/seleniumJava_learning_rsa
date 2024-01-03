package lessons;





import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.navigate().to("http://rahulshettyacademy.com/loginpagePractise");
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set<String> windows = chrome.getWindowHandles();//to get window handles in a set
		System.out.println(windows);
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		chrome.switchTo().window(childWindow);
		String email = chrome.findElement(By.xpath("//p[@class='im-para red']")).getText().split(" ")[4];
		chrome.switchTo().window(parentWindow);
		chrome.findElement(By.id("username")).sendKeys(email);
		
		
		
		
		
		
	}

}
 