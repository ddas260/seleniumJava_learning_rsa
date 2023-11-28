package lessons;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String uName="Dibyajyoti";
//		GeoogleChrome
//		Locate the file and assign to webdriver
		System.setProperty("webdriver.chrome.driver", "C:/BrowserDrivers/chromedriver.exe");
//		Creating a object of webdriver (invoking the browser)
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Send URL to the browser session
		chrome.get("https://rahulshettyacademy.com/locatorspractice/");
//		Find and set values or click to an element
		Thread.sleep(2000);//pause the script for 2000ms
		chrome.findElement(By.id("inputUsername")).sendKeys(uName);//"By.id" is used to get a input using id and "sendKeys" is used to send text or keystrokes to an input
		Thread.sleep(300);//pause the script for 500ms
		String password=getPassword(chrome);
		Thread.sleep(1000);
		chrome.findElement(By.name("inputPassword")).sendKeys(password);//"By.name" is used to get a input using name
		Thread.sleep(300);//pause the script for 500ms
		chrome.findElement(By.id("chkboxOne")).click();//"click" is used to send a click to a button/radio-button/check-box
		Thread.sleep(300);//pause the script for 500ms
		chrome.findElement(By.id("chkboxTwo")).click();
		Thread.sleep(300);//pause the script for 500ms
		chrome.findElement(By.className("signInBtn")).click();//"By.className" is used to get a input using a class name
		Thread.sleep(1000);//pause the script for 1000ms
		System.out.println(chrome.findElement(By.tagName("p")).getText());//"By.tagName" is used to get a input using a HTML tag
		Assert.assertEquals(chrome.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(chrome.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(chrome.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+uName+",");
		Thread.sleep(1000);//pause the script for 1000ms
		chrome.findElement(By.xpath("//*[text()='Log Out']")).click();//"//*[text()='Log Out']" this xpath indicated find element using any tag whicg has 'Log Out' text in it
		Thread.sleep(3000);//pause the script for 3000ms
		chrome.quit();

	}
	
	public static String getPassword(WebDriver c) throws InterruptedException {
		c.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		c.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(1000);
		String p1=c.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String p2=p1.split("'")[1];
		//String p3=p2[1];
		Thread.sleep(1000);
		c.findElement(By.className("go-to-login-btn")).click();
		return p2;
		
	}

}
