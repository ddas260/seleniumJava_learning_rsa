package lessons;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCusCode {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.navigate().to("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = chrome.findElements(By.xpath("//div[@class='product']/h4[@class='product-name']"));
//		int productIndex = 0;
//		for(WebElement product : products) {
//			if(product.getText().contains("Brocolli")) {
//				chrome.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(productIndex).click();
//				break;
//			}
//			productIndex++;
//		}
		int count = 0;
		String[] requiredItems = {"Beetroot", "Brinjal", "Potato", "Capsicum"};
		for(int i=0;i<products.size();i++) {
			String item = products.get(i).getText();
			String[] itemName = item.split(" ");
			List<String> items = Arrays.asList(requiredItems);
			if(items.contains(itemName[0])) {
				count++;
				chrome.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(i).click();
				if(count == requiredItems.length) {
					break;
				}
			}
		}
	}
}
