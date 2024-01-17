package lessons;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions options1 = new ChromeOptions();
		options1.setAcceptInsecureCerts(true);//accepting insecure certificates
		options1.addExtensions(new File("/home/dibyajyoti/eclipse-workspace/seleniumJava_learning_rsa/extensions/Post Scheduler 1.2.88.0.crx")); //adding an extension to the chrome session
//		Proxy prx = new Proxy();
//		prx.setHttpProxy("18.134.236.231:3128");
//		options1.setCapability("proxy", prx);
		options1.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
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
