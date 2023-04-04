package seleniumTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class TestingWithSelenium4 {

	WebDriver driver;
	
  @Test
  public void addRemove() throws InterruptedException {
	  
	  driver.findElement(By.linkText("Context Menu")).click();
	 WebElement theBox= driver.findElement(By.id("hot-spot"));
      Actions actions= new Actions(driver);	
	actions.contextClick(theBox).perform();
	Alert alert= driver.switchTo().alert();
  	alert.accept();
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
