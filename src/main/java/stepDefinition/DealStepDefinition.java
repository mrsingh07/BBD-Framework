//package stepDefinition;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepDefinition
//{
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page()
//	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com/");
//	}
//	
//	@When("^title of Login Page is Free CRM$")
//	public void title_of_Login_Page_is_Free_CRM()
//	{
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.",title);
//	}
//	
//	//	\"(.*)\" or \"([^\"]*)\"	Regular Expression
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials)
//	{
//		List <List<String>> data = credentials.raw();
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()
//	{
//		driver.findElement(By.xpath("//input[@type = 'submit' and @value = 'Login']")).click();
//	}
//
//	@Then("^user on home page$")
//	public void user_on_home_page()
//	{
//		String homepageTitle = driver.getTitle();
//		System.out.println(homepageTitle);
//		Assert.assertEquals("CRMPRO", homepageTitle);
//	}
//	
//	@Then("^user mouse over on Deals Link$")
//	public void user_mouse_over_on_Deals_Link() throws InterruptedException
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		Thread.sleep(2000);
//	}
//
//	@Then("^user click on New Deal Link$")
//	public void user_click_on_New_Deal_Link()
//	{
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	}
//
//	@Then("^user enters new deal details$")
//	public void user_enters_new_deal_details(DataTable credentials)
//	{
//		List <List<String>> dealData = credentials.raw();
//		driver.findElement(By.id("title")).sendKeys(dealData.get(0).get(0));
//		driver.findElement(By.xpath("//input[@name = 'client_lookup']")).sendKeys(dealData.get(0).get(1));
//		driver.findElement(By.id("amount")).sendKeys(dealData.get(0).get(2));
//		driver.findElement(By.id("probability")).sendKeys(dealData.get(0).get(3));
//		driver.findElement(By.id("commission")).sendKeys(dealData.get(0).get(4));
//	}
//
//	@Then("^user clicks on Save button$")
//	public void user_clicks_on_Save_button()
//	{
//		driver.findElement(By.xpath("//input[@type = 'submit' and @value = 'Save']")).click();
//	}
//
//	@Then("^verify new deal created$")
//	public void verify_new_deal_created()
//	{
//		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(), 'SSD')]")).isDisplayed();
//	}
//	
//	@Then("^close browser$")
//	public void close_browser()
//	{
//		driver.close();
//	}
//
//}
