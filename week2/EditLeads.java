package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Selva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arasu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sel");
		driver.findElement(By.name("departmentName")).sendKeys("Comms Media");
		driver.findElement(By.name("description")).sendKeys("I am working for Verizon");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("selva.arasu@yahoo.co.in");
		WebElement stateDropDown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd = new Select(stateDropDown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Selenium Class Work");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
