package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)chrome;
		js.executeScript("window.scrollBy(0,400)");
		WebElement table = chrome.findElement(By.cssSelector("table[name='courses']"));
		int tableRowCount = table.findElements(By.cssSelector("tr")).size();
		System.out.println("Table row count is: "+tableRowCount);
		int tableColumnCount = table.findElements(By.cssSelector("tr:nth-child(1) th")).size();
		System.out.println("Table column count is: "+tableColumnCount);
		List<WebElement> rowData = table.findElements(By.cssSelector("tr:nth-child(3) td"));
		for (int i=0;i<rowData.size();i++) {
			String cellData=rowData.get(i).getText();
			System.out.println(cellData);
		}
		
		
		

	}

}
