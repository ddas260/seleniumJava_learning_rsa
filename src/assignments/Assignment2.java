package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		        //System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
				WebDriver chrome=new ChromeDriver();
				chrome.get("https://rahulshettyacademy.com/angularpractice/");
				chrome.findElement(By.name("name")).sendKeys("Dibyajyoti Das");
				chrome.findElement(By.name("email")).sendKeys("approachddas@outlook.com");
				chrome.findElement(By.id("exampleInputPassword1")).sendKeys("1234567");
				chrome.findElement(By.cssSelector(".form-check-input")).click();
				chrome.findElement(By.id("exampleFormControlSelect1")).click();
				chrome.findElement(By.xpath("//select[@class='form-control']/option[contains(text(),'Male')]")).click();
				chrome.findElement(By.id("inlineRadio2")).click();
				chrome.findElement(By.name("bday")).sendKeys("08071995");
				chrome.findElement(By.className("btn-success")).click();
				
				Thread.sleep(2000);
				System.out.println(chrome.findElement(By.className("alert-success")).getText());
				
				
				
				

	}

}
