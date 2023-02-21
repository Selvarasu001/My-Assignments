package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selva");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Arasu");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9884370980");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Vinayaga");
		WebElement d = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(d);
		day.selectByIndex(9);
		WebElement m = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(m);
		month.selectByVisibleText("Jun");
		WebElement y = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(y);
		year.selectByValue("1985");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
