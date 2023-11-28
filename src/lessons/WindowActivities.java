package lessons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("http://google.com");
		chrome.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		chrome.navigate().back();
		//Thread.sleep(3000);
		chrome.navigate().forward();
		

	}

}
