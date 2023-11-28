package lessons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", null);
		WebDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome.navigate().to("https://www.amazon.in/");
		Actions a = new Actions(chrome); //creating an object of Action class
		a.moveToElement(chrome.findElement(By.xpath("//span[@class='nav-line-2']/span[@class='nav-icon nav-arrow']"))).build().perform(); // mouse hover to "Account @ Lists"
		

	}

}
