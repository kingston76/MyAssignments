package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement eleUser = driver.findElement(By.id("username"));
		eleUser.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("Testleaf$321");
		WebElement elelogin = driver.findElement(By.id("Login"));
		elelogin.click();
		
	}

}
