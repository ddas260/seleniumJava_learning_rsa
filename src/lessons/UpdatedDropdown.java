package lessons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		//Handling check boxes
		System.out.println(chrome.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());//to check if the check box is selected or not and print the value
		Assert.assertFalse(chrome.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());//TestNG class to check whether the value is false or not
		chrome.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).click();//Selecting the check box
		System.out.println(chrome.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());//to check if the check box is selected or not and print the value
		Assert.assertTrue(chrome.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());//TestNG class to check whether the value is true or not
		System.out.println(chrome.findElements(By.cssSelector("[type='checkbox']")).size());//To get the count of all check boxes
		
		//Selecting an option from complex drop down
		chrome.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//While loop to increase the Adult number value up to 5
//		int i=1;
//		while(i<5) {
//			chrome.findElement(By.id("hrefIncAdt")).click();//4 times this loop will be executed
//			i++;
//		}
		
		//For loop to increase the Adult number value up to 5
		for(int i=1;i<5;i++) {
			chrome.findElement(By.id("hrefIncAdt")).click();//4 times this loop will be executed
		}
		
		//Clicking DONE button
		chrome.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(chrome.findElement(By.id("divpaxinfo")).getText());//To print the selected option
		Assert.assertEquals(chrome.findElement(By.id("divpaxinfo")).getText(),"5 Adult");//TestNG class to check whether the actual output is matching with the expected output or not  
		
		//To check if the "Return Date" option is enabled or disabled with the Style CSS property
		if(chrome.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{
			System.out.println("It's enabled");
			Assert.assertTrue(false);
		}
		else
		{
			System.out.println("It's Disabled");
			Assert.assertTrue(true);
		}
		//System.out.println(chrome.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());//To check if the "Return Date" option is enabled or not (for this case it is enabled by default, but it's showing as disabled by a custom CSS property
		chrome.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//To select the radio button for "Round Trip"
		System.out.println(chrome.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());//To check if the radio button is clicked
		
		//To check if the "Return Date" option is enabled or disabled with the Style CSS property
		if(chrome.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("It's Disabled");
			Assert.assertTrue(false);
		}
		
		
		

	}

}
