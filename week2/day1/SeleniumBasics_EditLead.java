package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics_EditLead {

	public static void main(String[] args) {

		System.out.println("The Automation Testing Started");
		
		System.out.println("Setting up the driver for chrome browser");
		        WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				
				System.out.println("Chrome browser started");
				
				System.out.println("Started Assignment 2");

				
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
				
				//Enter first local name
				WebElement Lfname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
				Lfname.sendKeys("Tom");
				System.out.println("First Local name entered");
				
				//Enter Department value
				WebElement Deptval = driver.findElement(By.id("createLeadForm_departmentName"));
				Deptval.sendKeys("Testing");
				System.out.println("Department Value entered");
				
				//Enter description  field
				WebElement desc = driver.findElement(By.id("createLeadForm_description"));
				desc.sendKeys("Testing this site for the learning purpose");
				System.out.println("Description Value entered");
				
				//Enter Mail address
				WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
				email.sendKeys("ramakrishna136@gmail.com");
				System.out.println("Email Address entered");
				
				//Selecting state from dropdown
				Select SDD = new Select (driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				SDD.selectByVisibleText("New York");
				System.out.println("Selected State is: "+SDD);
				
				//Click on create button:
				WebElement Sbutton = driver.findElement(By.name("submitButton"));
				Sbutton.click();
				System.out.println("Clicked on create Lead");
				
				//Click on Edit Lead
				WebElement Elead = driver.findElement(By.linkText("Edit"));
				Elead.click();
				System.out.println("Edit Lead Click successfully");
				
				//Clearing description field
				WebElement descclear = driver.findElement(By.id("updateLeadForm_description"));
				descclear.clear();
				System.out.println("Description Field cleared Successfully");
				
				
				//Entering importan note
				WebElement impnote = driver.findElement(By.id("updateLeadForm_importantNote"));
				impnote.sendKeys("This field is entered after editing this page, it is important for the testing");
				System.out.println("Important note Field entered Successfully");
				
				//Click on update button
				WebElement updbtn = driver.findElement(By.name("submitButton"));
				updbtn.click();
				System.out.println("Updated the page Successfully");
				
				//Get page title
				System.out.println("The Page Title is: "+ driver.getTitle());	
				
				if(driver.getTitle().contains("View Lead | opentaps CRM")) {
					System.out.println("The Page title correct");
				}else
				{
					System.out.println("The Page title is not correct");

				}
				
				
				System.out.println("Successfully Completed Assignment 2");
				
				driver.quit();

				
	}

}
