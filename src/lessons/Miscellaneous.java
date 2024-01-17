package lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		//chrome.manage().window().minimize();//to minimize the chrome window
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();//to delete all cookies
		//chrome.manage().deleteCookieNamed("session");//to delete a cookie of a particular name
		chrome.get("https://www.google.com");
		

	}

}
