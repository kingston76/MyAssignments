package week2.day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class classass2 {

		public static void main(String[] args) {
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			//attribute based
			WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']"));
			eleUser.sendKeys("Demosalesmanager");
			//Text based
			WebElement elePassword = driver.findElement(By.xpath("//label[type()='password']"));
			elePassword.sendKeys("crmsfa");
			//
			WebElement elelogin = driver.findElement(By.className("decorativeSubmit"));
			elelogin.click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dropDown = new Select(eleSource);
			dropDown.selectByVisibleText("Conference");
			
			WebElement eleSource1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select dropDown1 = new Select(eleSource1);
			dropDown1.selectByValue("IND_FINANCE");
			
			WebElement eleSource2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select dropDown2 = new Select(eleSource2);
			dropDown2.selectByIndex(5);
			driver.quit();
			
		}

	}