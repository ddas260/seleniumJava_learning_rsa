package lessons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", null);
		WebDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome.manage().window().maximize();
		chrome.navigate().to("https://www.amazon.in/");
		Actions a = new Actions(chrome); //creating an object of Action class
		//mouse hover to the search-box and click then press left-shift button and enter "macbook"(to make all in caps) then double click on the text to select all of the text
		a.moveToElement(chrome.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("macbook").doubleClick().build().perform();
        //mouse hover to "Account & Lists" option in amazon India home page and right-click on that
		a.moveToElement(chrome.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();

	}

}
