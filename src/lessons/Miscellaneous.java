package lessons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		WebDriver chrome = new ChromeDriver();
		//chrome.manage().window().minimize();//to minimize the chrome window
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();//to delete all cookies
		//chrome.manage().deleteCookieNamed("session");//to delete a cookie of a particular name
		chrome.get("https://www.google.com");
		TakesScreenshot ss = (TakesScreenshot)chrome;
		File src= ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/home/dibyajyoti/Pictures/screenshot.png"));
	}
}
