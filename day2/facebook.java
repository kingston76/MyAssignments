package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement eleFirstName = driver.findElement(By.name("firstname"));
		eleFirstName.sendKeys("Kingston");
		WebElement eleLastName = driver.findElement(By.name("lastname"));
		eleLastName.sendKeys("Rolland");
		WebElement eleMobileNumber = driver.findElement(By.name("reg_email__"));
		eleMobileNumber.sendKeys("7502728260");
		WebElement elePassword = driver.findElement(By.id("password_step_input"));
		elePassword.sendKeys("Welcome@2022");
		WebElement eleDOB = driver.findElement(By.id("day"));
		Select dropDown = new Select(eleDOB);
		dropDown.selectByValue("6");
		WebElement eleSource1 = driver.findElement(By.id("month"));
		Select dropDown1 = new Select(eleSource1);
		dropDown1.selectByValue("9");
		WebElement eleSource2 = driver.findElement(By.id("year"));
		Select dropDown2 = new Select(eleSource2);
		dropDown2.selectByValue("1995");
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("websubmit")).click();

	}

	}

