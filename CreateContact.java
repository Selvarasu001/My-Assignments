package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Selva");
		driver.findElement(By.id("lastNameField")).sendKeys("Arasu");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sel");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("ras");
		driver.findElement(By.name("departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createContactForm_description")).sendKeys("CSE");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("selva.arasu@yahoo.co.in");
		WebElement ele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select st = new Select(ele);
		st.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Selenium Learning");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
