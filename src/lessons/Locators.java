package lessons;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		chrome.findElement(By.id("inputUsername")).sendKeys("rahul");//"By.id" is used to get a input using id and "sendKeys" is used to send text or keystrokes to an input
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.name("inputPassword")).sendKeys("rahulshettya");//"By.name" is used to get a input using name
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.id("chkboxOne")).click();//"click" is used to send a click to a button/radio-button/check-box
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.id("chkboxTwo")).click();
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.className("signInBtn")).click();//"By.className" is used to get a input using a class name
		System.out.println(chrome.findElement(By.cssSelector("p.error")).getText());//"By.cssSelector" is used to get a input using css-selector
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.linkText("Forgot your password?")).click();//"By.linkText" is used to get a input using link text (with an anchor tag)
		Thread.sleep(2000);//pause the script for 2000ms
		chrome.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dibyajyoti");//"By.xpath" is used to get a input using xpath
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dibyajyoti@email.com");//"By.cssSelector" is used to get a input using custom css-selector
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.xpath("//input[@type='text'][2]")).clear();//here "email" input is selected using xpath attribute indexing and "clear()" method is used to clear previous entries
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("dibyajyoti2@email.com");//here "email" input is selected using custom css-selector attribute indexing
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.xpath("//form/input[3][@type='text']")).sendKeys("8910067670");//here "email" input is selected using xpath tag(Parent-Child) indexing
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(chrome.findElement(By.cssSelector("form p")).getText());//here "email" input is selected using css tag(Parent-Child)
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//here "button" input is selected using xpath tag(Parent-Child) indexing
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");//here "By.cssSelector" is used to get a input using css-selector with id
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");//here "By.cssSelector" is used to get a input using css-selector with partial text (regular expression)
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.id("chkboxOne")).click();//"click" is used to send a click to a button/radio-button/check-box
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.id("chkboxTwo")).click();
		Thread.sleep(300);//pause the script for 300ms
		chrome.findElement(By.xpath("//button[contains(@class,'submit')]")).click();//"By.xpath" is used to get a input using a class name with regular expression
		
		
	}

}
