package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://jqueryui.com/droppable/");
		chrome.switchTo().frame(chrome.findElement(By.className("demo-frame")));
		Actions a = new Actions(chrome);
		WebElement fromDiv = chrome.findElement(By.id("draggable"));
		WebElement toDiv = chrome.findElement(By.id("droppable"));
		a.dragAndDrop(fromDiv, toDiv).build().perform();
		
	}

}
