package lessons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver chrome = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) chrome;//Initializing JS executor to execute JS codes in runtime
		chrome.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,500)");//scroll down the browser window by 500px in y-axis
		Thread.sleep(1000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");//scroll down the table by 500px in y-axis
		List<WebElement> amounts = chrome.findElements(By.cssSelector("table[id='product'] td:nth-child(4)"));//select all the cells of 4th column of a table 
		int total = 0;
		//get sum of all the values present in the table 4th column
		for (int i = 0; i < amounts.size(); i++) {
			int amount = Integer.parseInt(amounts.get(i).getText());
			total = total + amount;
		}
		System.out.println(total);
		//get the total from the web page
		int predefinedTotal = Integer.parseInt(chrome.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(predefinedTotal, total); //verify that the total comes from the cell values and the total is shown in web page are same
	}
}
