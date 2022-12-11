package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		WebElement eleUser = driver.findElement(By.id("username"));
		eleUser.sendKeys("Demosalesmanager");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		WebElement elelogin = driver.findElement(By.className("decorativeSubmit"));
		elelogin.click();
	}

}
