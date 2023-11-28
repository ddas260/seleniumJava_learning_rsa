package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name = "Dibyajyoti Das";
		chrome.findElement(By.id("name")).sendKeys(name);
		chrome.findElement(By.cssSelector("[id=alertbtn]")).click();
		System.out.println(chrome.switchTo().alert().getText());// To get the text of an js alert
		chrome.switchTo().alert().accept();// To accept the js alert
		chrome.findElement(By.id("name")).sendKeys(name);
		chrome.findElement(By.id("confirmbtn")).click();
		System.out.println(chrome.switchTo().alert().getText());// To get the text of an js alert
		chrome.switchTo().alert().dismiss();// To dismiss the js alert

	}

}
