package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// find username and typevalue in textbox
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shreyas");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shrey");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("70,000.00");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome all");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Read all the instructions below");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Harathi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Harath");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Assurance");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10,000");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("NASQAQ");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("(0)44");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shreyas07@yahoo.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7459455082");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Shreyas");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No. 15, Lakshmi street, Yashmi Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("No.8, Dhrishi street, West Thalak");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("050");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("3800");
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	
	

}
