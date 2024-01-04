package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome.get("https://the-internet.herokuapp.com");
		chrome.findElement(By.linkText("Nested Frames")).click();
		chrome.switchTo().frame(chrome.findElement(By.name("frame-top")));
		chrome.switchTo().frame(chrome.findElement(By.name("frame-middle")));
		String frameText = chrome.findElement(By.id("content")).getText();
		System.out.println(frameText);
	}

}
