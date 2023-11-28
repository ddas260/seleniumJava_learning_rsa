package lessons;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		//implicit wait
		//chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//explicit wait
		WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(5));
		
		String[] itemsNeeded = { "Cucumber", "Cauliflower", "Pumpkin" };
		
		// To call a method which is not static
//		base a=new base();
//		a.addItemsToCart(chrome, itemsNeeded);
		
		//To call a static method
		addItemsToCart(chrome, itemsNeeded);
		chrome.findElement(By.xpath("//a[@class='cart-icon']/img[@alt='Cart']")).click();
		chrome.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));//to wait until the webelement is visible
		chrome.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		chrome.findElement(By.cssSelector("button.promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));//to wait until the webelement is visible
		System.out.println(chrome.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		
		
		
		
		
		

		

	}
	
	
	public static void addItemsToCart(WebDriver bDriver, String[] itemsToAddToCart) {		
		//bDriver.manage().window().maximize();
		bDriver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> items = bDriver.findElements(By.xpath("//h4[@class='product-name']"));
		//Using enhanced for loop for adding Cauliflower to cart
//		int j = 0;
//		for (WebElement item : items) {
//			if (item.getText().contains("Cauliflower")) {
//				chrome.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(j).click();
//				break;
//			}
//			j++;
//
//		}
		
		//Using while loop for adding Beetroot to cart
//		int k = 0;
//		while (k < items.size()) {
//			String item = items.get(k).getText();
//			if (item.contains("Beetroot")) {
//				chrome.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(k).click();
//				break;
//			}
//			k++;
//
//		}
		
		//Using do while loop for adding Carrot to cart
//		int l = 0;
//		do {
//			String item = items.get(l).getText();
//			if (item.contains("Carrot")) {
//				chrome.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(l).click();
//				break;
//			}
//			l++;
//		} while (l < items.size());
		
		//Using for loop for adding cucumber (RSA)
//		for (int i = 0; i < items.size(); i++) {
//			String item = items.get(i).getText();
//			if (item.contains("Cucumber")) {
//				chrome.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(i).click();
//				break;
//			}
//		}
		
		//My code for selecting multiple items	
//		for (int i = 0; i < items.size(); i++) {
//			String item = items.get(i).getText();
//			String[] itemNeeded=item.split(" ");
//			List<String> itemsForCart=Arrays.asList(itemsToAddToCart);
//			
//			if (itemsForCart.contains(itemNeeded[0])) {
//				bDriver.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(i).click();
//			}
//		}
		
		
		//RSA Code for selecting multiple items
		int count=0;
		for (int i = 0; i < items.size(); i++) {
			String item = items.get(i).getText();
			// to get the name formatted properly
			String[] splittedItemName = item.split("-");
			String formattedName = splittedItemName[0].trim();
			List<String> itemsForCart = Arrays.asList(itemsToAddToCart);
			if (itemsForCart.contains(formattedName)) {
				count++;
				bDriver.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(i).click();
				if(count==itemsToAddToCart.length) {
					break;
				}

			}
		}
		
		
	}

}
