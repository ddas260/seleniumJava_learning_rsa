package lessons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		chrome.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		chrome.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000);
		//chrome.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();//"(//a[@value='BHO'])[2]" it's for defining 2nd index of the same xpath
		chrome.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']")).click();//"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']" this is a parent child relationship xapath
		chrome.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	}

}