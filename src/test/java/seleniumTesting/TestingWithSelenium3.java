package seleniumTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestingWithSelenium3 {
 
	WebDriver driver;
	
  @Test
  public void addRemove() throws InterruptedException {
	  
	  driver.findElement(By.linkText("Checkboxes")).click();
	
		//clicking the two check boxes couple of times and finally keeping both checked. 
	  
	  driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
	  driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).click();
	  driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).click();
	  driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
	  driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).click();
	  driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
	  driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).click();
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
