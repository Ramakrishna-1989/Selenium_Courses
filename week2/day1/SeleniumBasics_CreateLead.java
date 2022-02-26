package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics_CreateLead {

	public static void main(String[] args) {

		System.out.println("The Automation Testing Started");
		
System.out.println("Setting up the driver for chrome browser");
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		
		System.out.println("Chrome browser started");
		
		driver.manage().window().maximize();
		
		//accessing the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("URL accessed successfully");
		
		//enter the username
		WebElement eusername = driver.findElement(By.id("username"));
		eusername.sendKeys("Demosalesmanager");
		System.out.println("Username entered Successfully");
		
		//enter the password
		WebElement epassword = driver.findElement(By.id("password"));
		epassword.sendKeys("crmsfa");
		System.out.println("Password entered Successfully");
		
		//click on login button
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		System.out.println("Logged in Successfully");

		
		//click on link
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		System.out.println("Clicked on Link Successfully");

		
		//Click on Leads option
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		System.out.println("Clicked on Leads link Successfully");
		
		//Click on create lead option
		WebElement Clead = driver.findElement(By.linkText("Create Lead"));
		Clead.click();
		System.out.println("Clicked on Create Lead link Successfully");
		
		//Enter the company name
		WebElement Cname = driver.findElement(By.id("createLeadForm_companyName"));
		Cname.sendKeys("XYZ");
		System.out.println("Company name entered successfully");
		
		//Enter First name
		WebElement Fname = driver.findElement(By.id("createLeadForm_firstName"));
		Fname.sendKeys("Ramakrishna");
		System.out.println("Firstname entered");
		
		
		//Enter Last name
		WebElement Lname = driver.findElement(By.id("createLeadForm_lastName"));
		Lname.sendKeys("DV");
		System.out.println("Lastname entered");
		
		
		//select value from dropdown
		Select dd  = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		dd.selectByValue("LEAD_EMPLOYEE");
		
		//Click on create button:
				WebElement Sbutton = driver.findElement(By.name("submitButton"));
				Sbutton.click();
				System.out.println("Clicked on create Lead");
		
				System.out.println("Successfully Completed project");

//		//select class for dropdown
//		WebElement selectedoption = dd.getFirstSelectedOption();
//		System.out.println(selectedoption.getText());
//		
//		
//		List<WebElement> options = dd.getOptions();
//		for (int i=0; i<options.size() ; i++) {
//			WebElement eachElement = options.get(i);
//			System.out.println(eachElement.getText());
				
				driver.quit();

		}
		
		
		

		
		
	}


