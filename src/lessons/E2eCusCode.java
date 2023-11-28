package lessons;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2eCusCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", null);
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		//Test-1 To select "India" by handling "Country" Auto suggestive drop-down 
		chrome.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
		List <WebElement> options=chrome.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		Thread.sleep(1000);
		System.out.println("Now the search value is "+chrome.findElement(By.id("autosuggest")).getAttribute("value"));
		Assert.assertEquals(chrome.findElement(By.id("autosuggest")).getAttribute("value"), "India");
		System.out.println("Test-1  : Passed");
		
		//Test-2 Selecting "Round Trip" by handling journey type radio options
		Thread.sleep(2000);
		List <WebElement> radioButtons=chrome.findElements(By.cssSelector("input[id*='ctl00_mainContent_rbtnl']"));
		for(WebElement radioButton:radioButtons) {
			if(radioButton.getAttribute("value").equalsIgnoreCase("RoundTrip")) {
				radioButton.click();
				break;
			}
		}
		Thread.sleep(1000);
		
		List <WebElement> radioButtonsChks=chrome.findElements(By.cssSelector("input[id*='ctl00_mainContent_rbtnl']"));
		for(WebElement radioButtonChk:radioButtonsChks) {
			if(radioButtonChk.isSelected()) {
				System.out.println("Now the selected option is "+radioButtonChk.getAttribute("value"));
				break;
			}
		}
		
		Assert.assertTrue(chrome.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());
		System.out.println("Test-2  : Passed");
		
		//Test-2.1 To check whether the "Return Date" selector is enabled or not
		Thread.sleep(1400);
		if(chrome.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
			System.out.println("'Return Date' selector is now enabled");
		}
		else {
			System.out.println("'Return Date' selector is still disabled");
		}
		Assert.assertTrue(chrome.findElement(By.id("Div1")).getAttribute("Style").contains("1"));
		System.out.println("Test-2.1: Passed");
		
		//Test-3 To select "From" and "To" destinations
		Thread.sleep(2000);
		chrome.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		chrome.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(1000);
		chrome.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
		Thread.sleep(1000);
		System.out.println("Now the selected option for 'From' is "+chrome.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value"));
		Assert.assertTrue(chrome.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value").equalsIgnoreCase("Ahmedabad (AMD)"));
		System.out.println("Now the selected option for 'To' is "+chrome.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));
		Assert.assertTrue(chrome.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value").equalsIgnoreCase("Jaipur (JAI)"));
		System.out.println("Test-3  : Passed");
		
		//Test-4 To select "Depart Date" and "Return Date" 
		Thread.sleep(2000);
		//Selecting a specific date
		List<WebElement> departDates = chrome.findElements(By.cssSelector("div[class*='ui-datepicker-group-first'] a[class='ui-state-default']"));//to get all the dates in a month
		//to get the required date and select
		for(WebElement departDate:departDates) {
			if(departDate.getText().equalsIgnoreCase("29")) {
				departDate.click();
				break;
			}
		}
		//chrome.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//This is for direct select default date
		Thread.sleep(1000);
		chrome.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(500);
		//Selecting a specific date
		List<WebElement> returnDates = chrome.findElements(By.cssSelector("div[class*='ui-datepicker-group-last'] a[class='ui-state-default']"));//to get all the dates in a month
		//to get the required date and select
		for(WebElement returnDate:returnDates) {
			if(returnDate.getText().equalsIgnoreCase("29")) {
				returnDate.click();
				break;
			}
		}
		Thread.sleep(1000);
		System.out.println("Now the selected 'Depart Date' is "+chrome.findElement(By.id("ctl00_mainContent_view_date1")).getAttribute("value"));
		Assert.assertTrue(chrome.findElement(By.id("ctl00_mainContent_view_date1")).getAttribute("value").equalsIgnoreCase("29/11"));
		System.out.println("Now the selected 'Return Date' is "+chrome.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("value"));
		Assert.assertTrue(chrome.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("value").equalsIgnoreCase("29/12"));
		System.out.println("Test-4  : Passed");
		
		//Test-5 To select "Adult" "Child" and "Infant" passenger counts
		Thread.sleep(2000);
		chrome.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int adltCount=1;adltCount<3;adltCount++) {
			chrome.findElement(By.id("hrefIncAdt")).click();
		}
		for(int chldCount=0;chldCount<2;chldCount++) {
			chrome.findElement(By.id("hrefIncChd")).click();
		}
		for(int inftCount=0;inftCount<1;inftCount++) {
			chrome.findElement(By.id("hrefIncInf")).click();
		}
		chrome.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(1000);
		System.out.println("Now the selected 'Passengers' are "+chrome.findElement(By.id("divpaxinfo")).getText());
		Assert.assertTrue(chrome.findElement(By.id("divpaxinfo")).getText().equalsIgnoreCase("3 Adult, 2 Child, 1 Infant"));
		System.out.println("Test-5  : Passed");
		
		//Test-6 To select the "Currency" by handling static drop-down (with 'select' tag)
		Thread.sleep(2000);
		WebElement crncySelector=chrome.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select crncy=new Select(crncySelector);
		crncy.selectByValue("USD");
		Thread.sleep(1000);
		System.out.println("Now the selected option for 'Currency' is "+crncy.getFirstSelectedOption().getText());
		Assert.assertTrue(crncy.getFirstSelectedOption().getText().contentEquals("USD"));
		System.out.println("Test-6  : Passed");
		
		//Test-7 To check the "Senior Citizen" check-box
		Thread.sleep(2000);
		chrome.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		Thread.sleep(1000);
		if(chrome.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected()) {
			System.out.println("Now 'Senior ctizen' is checked");
		}
		else {
			System.out.println("Now 'Senior ctizen' is not checked");
		}
		Assert.assertTrue(chrome.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
		System.out.println("Test-7  : Passed");
		
		//Test-8 To click the "Search" button  
		Thread.sleep(2000);
		chrome.findElement(By.cssSelector("input[value='Search']")).click();
		System.out.println("Now the Search button is clicked");		

	}

}
