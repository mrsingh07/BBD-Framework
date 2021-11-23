package stepDefinition;

import org.junit.Assert;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//data table with maps: for parameterization of test cases

public class DealStepWithMapDefinition
{
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
	}
	
	@When("^title of Login Page is Free CRM$")
	public void title_of_Login_Page_is_Free_CRM()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.",title);
	}
	
	//	\"(.*)\" or \"([^\"]*)\"	Regular Expression
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)
	{
		for(Map<String, String>	data : credentials.asMaps(String.class, String.class))
		{
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()
	{
		driver.findElement(By.xpath("//input[@type = 'submit' and @value = 'Login']")).click();
	}

	@Then("^user on home page$")
	public void user_on_home_page()
	{
		String homepageTitle = driver.getTitle();
		System.out.println(homepageTitle);
		Assert.assertEquals("CRMPRO", homepageTitle);
	}
	
	@Then("^user mouse over on Deals Link$")
	public void user_mouse_over_on_Deals_Link() throws InterruptedException
	{
		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		Thread.sleep(2000);
	}

	@Then("^user click on New Deal Link$")
	public void user_click_on_New_Deal_Link()
	{
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("^user enters new deal details$")
	public void user_enters_new_deal_details(DataTable credentials)
	{
		for(Map<String, String> dealData : credentials.asMaps(String.class, String.class))
		{
			driver.findElement(By.id("title")).sendKeys(dealData.get("title"));
			driver.findElement(By.xpath("//input[@name = 'client_lookup']")).clear();
			driver.findElement(By.xpath("//input[@name = 'client_lookup']")).sendKeys(dealData.get("company"));
			driver.findElement(By.id("amount")).sendKeys(dealData.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(dealData.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(dealData.get("commission"));
			
			driver.findElement(By.xpath("//input[@type = 'submit' and @value = 'Save']")).click();
			
			//move to new deal page:
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
	}


	@Then("^verify new deal created$")
	public void verify_new_deal_created()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Laptop')]")).isDisplayed();
		driver.findElement(By.xpath("//a[contains(text(), 'CCTV')]")).isDisplayed();
		driver.findElement(By.xpath("//a[contains(text(), 'DVD')]")).isDisplayed();
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
		driver.close();
	}

}
