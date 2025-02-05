package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stock 
{
	public static WebDriver driver;
	String str,str1;
	@Given("i open my browser_url {string}")
	public void i_open_my_browser_url(String url) 
	{
		System.setProperty("Webdriver.chromedriver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	    
	}
	@When("i enter stock account username {string}")
	public void i_enter_stock_account_username(String username) throws InterruptedException
	{
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(username);
		
	  
	}
	@When("i enter stock account password {string}")
	public void i_enter_stock_account_password(String password) throws InterruptedException
	{
		driver.findElement(By.id("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("click on stock account login button")
	public void click_on_stock_account_login_button() 
	{
	    driver.findElement(By.id("btnsubmit")).click();
	}
	@When("click on supplier")
	public void click_on_supplier()
	{
	   driver.findElement(By.linkText("Suppliers")).click();
	}
	@When("click on Add icon")
	public void click_on_add_icon() 
	{
     driver.findElement(By.xpath("(//span[@class=\"glyphicon glyphicon-plus ewIcon\"])[1]")).click();
	}
	@When("capature the supplier number")
	public void capature_the_supplier_number() 
	{
      str=driver.findElement(By.id("x_Supplier_Number")).getAttribute("value");
     System.out.println(str);
	}
	@When("Enter supplier name {string}")
	public void enter_supplier_name(String suppliername) 
	{
      driver.findElement(By.id("x_Supplier_Name")).sendKeys(suppliername);
	}
	@When("Enter Address {string}")
	public void enter_address(String Address) 
	{
		driver.findElement(By.id("x_Address")).sendKeys(Address);

	}
	@When("Enter city {string}")
	public void enter_city(String city) 
	{
     driver.findElement(By.id("x_City")).sendKeys(city);
	}
	@When("Enter country {string}")
	public void enter_country(String country) 
	{
		driver.findElement(By.id("x_Country")).sendKeys(country);

	}
	@When("Enter contact person {string}")
	public void enter_contact_person(String contactperson)
	{
	    driver.findElement(By.id("x_Contact_Person")).sendKeys(contactperson);
	}
	@When("Enter phonenumber {string}")
	public void enter_phonenumber(String phonenumber) 
	{
	   driver.findElement(By.id("x_Phone_Number")).sendKeys(phonenumber);
	}
	@When("Enter email {string}")
	public void enter_email(String email) 
	{
	    driver.findElement(By.id("x__Email")).sendKeys(email);
	}
	@When("Enter Mobilenumber {string}")
	public void enter_mobilenumber(String Mobilenumber) 
	{
		driver.findElement(By.id("x_Mobile_Number")).sendKeys(Mobilenumber);
	   
	}
	@When("Enter note {string}")
	public void enter_note(String notes) 
	{
      driver.findElement(By.id("x_Notes")).sendKeys(notes);
	}
	@When("click on inside Add icon")
	public void click_on_inside_add_icon() throws InterruptedException 
	{
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@id=\"btnAction\"]")).click();
	}
	@When("click on Add new record")
	public void click_on_add_new_record() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"OK!\"]")).click();
	}
	@When("click on Add succeeded")
	public void click_on_add_succeeded() throws InterruptedException 
	{
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//button[text()=\"OK\"])[6]")).click();
	}
	@When("click on search icon")
	public void click_on_search_icon()
	{
    driver.findElement(By.xpath("//span[@class=\"glyphicon glyphicon-search ewIcon\"]")).click();
	}
	@When("paste supplier number into search box")
	public void paste_supplier_number_into_search_box() throws InterruptedException 
	{
      driver.findElement(By.id("psearch")).click();
      Thread.sleep(3000);
      driver.findElement(By.id("psearch")).sendKeys(str);
	}
	@When("click on search button")
	public void click_on_search_button() throws InterruptedException 
	{
	    driver.findElement(By.xpath("//button[@id=\"btnsubmit\"]")).click();
	    Thread.sleep(3000);
	}
	@When("click on supplier logout")
	public void click_on_supplier_logout() throws InterruptedException 
	{
	   driver.findElement(By.linkText("Logout")).click();
	   driver.findElement(By.xpath("//button[text()=\"OK!\"]")).click();
	   Thread.sleep(3000);
	}
	@When("i close my stock account browser")
	public void i_close_my_stock_account_browser() 
	{
	  driver.close(); 
	}
	
	@When("click on customer")
	public void click_on_customer() 
	{
	    driver.findElement(By.linkText("Customers")).click();
	}
	@When("capature the customer number")
	public void capature_the_customer_number() 
	{
	    str1=driver.findElement(By.id("x_Customer_Number")).getAttribute("value");
	    System.out.println(str1);
	}
	@When("Enter customer name {string}")
	public void enter_customer_name(String customername) 
	{
	    driver.findElement(By.id("x_Customer_Name")).sendKeys(customername);
	}
	@When("paste customer number into search box")
	public void paste_customer_number_into_search_box() 
	{
	   driver.findElement(By.id("psearch")).sendKeys(str1);
	}
	@When("click on customer logout")
	public void click_on_customer_logout() throws InterruptedException 
	{
		   driver.findElement(By.linkText("Logout")).click();
		   driver.findElement(By.xpath("//button[text()=\"OK!\"]")).click();
		   Thread.sleep(3000);
	}


}
