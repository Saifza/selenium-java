package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingWithSelenium1 {
	WebDriver driver;
	
	  @Test
	  public void addRemove() throws InterruptedException {
		  
		  driver.findElement(By.linkText("Add/Remove Elements")).click();
		  
		 WebDriverWait wait= new WebDriverWait(driver,5);
		 WebElement addremove=  driver.findElement(By.xpath("//div/button[@onclick=\"addElement()\"]"));
		 wait.until(ExpectedConditions.elementToBeClickable(addremove));
		 addremove.click();
		 
		 WebElement delete= driver.findElement(By.xpath("//div/button[@onclick=\"deleteElement()\"]"));
		 
		 delete.click();
		 
		 wait.until(ExpectedConditions.invisibilityOf(delete));
		
			  }
	  
	  @BeforeMethod
	  public void launchBrowser() {
		  
			 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	 
			
		  driver= new ChromeDriver();
		
		  driver.get("https://the-internet.herokuapp.com/");
		   driver.manage().window().maximize();


	}
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.close();
	  }
}
