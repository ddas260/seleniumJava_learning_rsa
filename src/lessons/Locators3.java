package lessons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/BrowserDrivers/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Sibling-Child to parent traverse
		//'//header/div/button/following-sibling::button[1]'
		//'//header/div/button/following-sibling::button[1]/parent::div/button[1]'
		System.out.println(chrome.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
		System.out.println(chrome.findElement(By.xpath("//header/div/button/following-sibling::button[1]/parent::div/button[1]")).getText());
		chrome.quit();

	}

}
