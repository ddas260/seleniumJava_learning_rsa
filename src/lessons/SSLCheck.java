package lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions options1 = new ChromeOptions();
		options1.setAcceptInsecureCerts(true);
		WebDriver chrome = new ChromeDriver(options1);
		chrome.get("https://expired.badssl.com/");
		System.out.println(chrome.getTitle());
		//for Microsoft Edge
//		EdgeOptions options2 = new EdgeOptions();
//		options2.setAcceptInsecureCerts(true);
//		WebDriver edge = new EdgeDriver(options2);
//		edge.get("https://expired.badssl.com/");
//		System.out.println(edge.getTitle());
		//for Mozilla Firefox
		//System.setProperty("webdriver.gecko.driver", "/home/dibyajyoti/BrowserDrivers/geckodriver-v0.34.0-linux64/geckodriver");
//		FirefoxOptions options3 = new FirefoxOptions();
//		options3.setAcceptInsecureCerts(true);
//		WebDriver firefox = new FirefoxDriver(options3);
//		firefox.get("https://expired.badssl.com/");
//		System.out.println(firefox.getTitle());

	}
	

}
