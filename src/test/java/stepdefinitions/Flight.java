package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flight 

{
	public static WebDriver driver;
	
	@Given("i open my browser url {string}")
	public void i_open_my_browser_url(String url) 
	{
		System.setProperty("Webdriver.chromedriver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	    
	}
	@When("i enter  my username {string}")
	public void i_enter_my_username(String name) 
	{
		driver.findElement(By.name("email")).sendKeys(name);
	    
	}
	@When("i enter my password {string}")
	public void i_enter_my_password(String password) 
	{
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}
	@When("i click on sign in button")
	public void i_click_on_sign_in_button() 
	{
	    driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
	}
	@When("i select date of flight")
	public void i_select_date_of_flight() 
	{
		driver.findElement(By.id("search-date")).click();
		String str="16-November-2030";
		String[] temp=str.split("-");
		String d=temp[0];
		String m=temp[1];
		String y=temp[2];
		
		String y1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		while(!y1.equals(y))
		{
			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
			y1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		}
		
		String m1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		while(!m1.equals(m))
		{
			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
			m1=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		}
		WebElement a=driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]"));
		List<WebElement> row=a.findElements(By.tagName("tr"));
		for(int i=1;i<row.size();i++)
		{
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			for(WebElement b: col)
			{
				String f=b.getText();
				if(f.equals(d))
				{
					b.click();
					break;
				}
			}
		}
	    
	}
	
	@When("i select fly from")
	public void i_select_fly_from() 
	{
	    WebElement a=driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf2\"]"));
	    Select sc=new Select(a);
	    sc.selectByVisibleText("Hyderabad");
	}
	@When("i select fly to")
	public void i_select_fly_to() 
	{
		WebElement b=driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf3\"]"));
		Select sc1=new Select(b);
		sc1.selectByVisibleText("Chennai");
		
	    
	}
	@When("i enter my name {string}")
	public void i_enter_my_name(String name1)
	
	{
		driver.findElement(By.id("name")).sendKeys(name1);
	    
	}
	@When("i select business")
	public void i_select_business() 
	{
	   driver.findElement(By.xpath("//input[@value=\"Business\"]")).click();
	}
	@When("click on insert")
	public void click_on_insert() throws InterruptedException 
	{
       driver.findElement(By.xpath("//button[text()=\"Insert Order\"]")).click();
       Thread.sleep(6000);
	}
	@When("i click on logout button")
	public void i_click_on_logout_button() throws InterruptedException 
	{
	   driver.findElement(By.xpath("//i[@class=\"fa fa-gear\"]")).click();
	   driver.findElement(By.linkText("Logout")).click();
	   Thread.sleep(6000);
	}
	@When("i close my browser")
	public void i_close_my_browser()
	{
		driver.close();
	    
	}
	
	@Then("i should see error message is to display")
	public void i_should_see_error_message_is_to_display() 
	{
	 boolean res  = driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissable\"]")).isDisplayed();
	 
	  if(res)
	  {
		  System.out.println("pass");
	  }else
	  {
		  System.out.println("fail");
	  }

	}}

