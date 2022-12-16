package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testuipath {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();

		WebElement eleEmail = driver.findElement(By.name("email"));
		eleEmail.sendKeys("kumar.testleaf@gmail.com");
		WebElement elePassword = driver.findElement(By.name("password"));
		elePassword.sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
	}

}
