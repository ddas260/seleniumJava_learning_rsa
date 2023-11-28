package assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(2));
		chrome.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		chrome.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		chrome.findElement(By.id("password")).sendKeys("learning");
		chrome.findElement(By.xpath("//input[@value='user']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-body")));
		chrome.findElement(By.id("okayBtn")).click();
		WebElement options = chrome.findElement(By.xpath("//div[@class='form-group']/select[@class='form-control']"));
		Select dropOptions = new Select(options);
		dropOptions.selectByValue("consult");
		chrome.findElement(By.id("terms")).click();
		chrome.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my-4")));
		
		List<WebElement> products = chrome.findElements(By.xpath("//h4[@class='card-title']/a"));
		String[] reqProducts = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		int count = 0;
		for (int i = 0; i < products.size(); i++) {
			String product = products.get(i).getText();
			List<String> productAdd = Arrays.asList(reqProducts);
			if (productAdd.contains(product)) {
				count++;
				chrome.findElements(By.xpath("//div[@class='card-footer']/button[@class='btn btn-info']")).get(i)
						.click();
				if (count == reqProducts.length) {
					break;
				}

			}
		}
		
		chrome.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}

}

