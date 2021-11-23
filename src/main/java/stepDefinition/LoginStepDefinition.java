//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//
//public class LoginStepDefinition
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
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password)
//	{
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
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
//	@Then("^user mouse over on Contacts Link$")
//	public void user_mouse_over_on_Contacts_Link() throws InterruptedException
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		Thread.sleep(2000);
//	}
//
//	@Then("^user click on New Contact Link$")
//	public void user_click_on_New_Contact_Link()
//	{
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}
//
//	@Then("^user enters new  contact detail \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contact_details(String firstname, String lastname, String mobileNo)
//	{
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("mobile")).sendKeys(mobileNo);
//	}
//
//	@Then("^user clicks on Save button$")
//	public void user_clicks_on_Save_button()
//	{
//		driver.findElement(By.xpath("//input[@type = 'submit' and @value = 'Save']")).click();
//	}
//
//	@Then("^verify new contact created$")
//	public void verify_new_contact_created()
//	{
//		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(), 'Tom David')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).isDisplayed();
//	}
//	
//	@Then("^close browser$")
//	public void close_browser()
//	{
//		driver.close();
//	}
//	
//	
//
//}
