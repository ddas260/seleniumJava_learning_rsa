package lessons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking Browser
				// ChromeDriver -> Methods close get
				// FirefoxDriver -> Methods close get
				// WebDriver -> Methods close get
				// chromedriver.exe -> invokes chrome browser

				// GeoogleChrome
				// Locate the file and assign to webdriver
				//System.setProperty("webdriver.chrome.driver", "C:/BrowserDrivers/chromedriver.exe");
				// Invoking the CromeDriver
				WebDriver cdriver = new ChromeDriver();
				System.out.println("Opening Google Chrome");
				// Setting the URL into the browser
				cdriver.get("https://google.com");
				// Getting the website tile
				String cTitle = cdriver.getTitle();
				System.out.println(cTitle);
				// Getting the url after page load
				String cUrl = cdriver.getCurrentUrl();
				System.out.println(cUrl);
				// Close the tab (only current window)
				// cdriver.close();
				// Close the browser window (all the associated windows)
				cdriver.quit();

				// MozillaFirefox
				// Locate the file and assign to webdriver
				//System.setProperty("webdriver.gecko.driver", "C:/BrowserDrivers/geckodriver.exe");
				// Invoking the CromeDriver
				WebDriver fdriver = new FirefoxDriver();
				System.out.println("Opening Mozilla Firefox");
				// Setting the URL into the browser
				fdriver.get("https://google.com");
				// Getting the website tile
				String fTitle = fdriver.getTitle();
				System.out.println(fTitle);
				// Getting the url after page load
				String fUrl = fdriver.getCurrentUrl();
				System.out.println(fUrl);
				// Close the tab (only current window)
				// fdriver.close();
				// Close the browser window (all the associated windows)
				fdriver.quit();

				// Microsoft Edge
				// Locate the file and assign to webdriver
				//System.setProperty("webdriver.edge.driver", "C:/BrowserDrivers/msedgedriver.exe");
				// Invoking the EdgeDriver
				WebDriver edriver = new EdgeDriver();
				System.out.println("Opening Microsoft Edge");
				// Setting the URL into the browser
				edriver.get("https://google.com");
				// Getting the website tile
				String eTitle = edriver.getTitle();
				System.out.println(eTitle);
				// Getting the url after page load
				String eUrl = edriver.getCurrentUrl();
				System.out.println(eUrl);
				// Close the tab (only current window)
				// edriver.close();
				// Close the browser window (all the associated windows)
				edriver.quit();
		

	}

}
