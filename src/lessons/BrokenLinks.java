package lessons;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver chrome = new ChromeDriver();
		chrome.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
//        String linkUrl = chrome.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//        System.out.println(linkUrl);
		SoftAssert sa = new SoftAssert();
		List<WebElement> links = chrome.findElements(By.cssSelector("li[class='gf-li'] a"));

		for (WebElement link : links) {
			String linkUrl = link.getAttribute("href");
			URL url = new URL(linkUrl);
			URLConnection UrlCon = url.openConnection();
			HttpURLConnection connection = (HttpURLConnection) UrlCon;
			connection.setRequestMethod("HEAD");
			connection.connect();
			int response = connection.getResponseCode();
			System.out.println(response);

			// response wise message
//			if (response > 400) {
//				System.out.println(response + " for the broken link of " + "\"" + link.getText() + "\"");
//				Assert.assertTrue(false);
//			} else {
//				System.out.println(response + " for the link of " + "\"" + link.getText() + "\"");
//			}

			// to get a message for the broken link using if condition and break the test
			// using Assert class
//			if (response > 400) {
//				System.out.println("response is broken for link of " + "\"" + link.getText() + "\"");
//				Assert.assertTrue(false);
//			}

			// to get a message for the broken link and break the test using Assert class
//			Assert.assertTrue(response < 400, "response is broken for link of " + "\"" + link.getText() + "\"");
			
			//to do soft assert and store the message for the broken link and continue the test
			sa.assertTrue(response < 400, "response is broken for link of " + "\"" + link.getText() + "\"");
		}
		//to get all previously stored assert message together
		sa.assertAll();
	}
}
