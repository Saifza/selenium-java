package seleniumTesting;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingWithSelenium5 {
	WebDriver driver;
	  @Test
	  public void slider() throws AWTException, InterruptedException {
		  
		  driver.findElement(By.linkText("Hovers")).click();
	WebElement users2= driver.findElement(By.xpath("//a[@href=\"/users/2\"]//parent::div//parent::div//child::img"));
	WebElement users1=driver.findElement(By.xpath("//a[@href=\"/users/1\"]//parent::div//parent::div//child::img"));
	WebElement users3=driver.findElement(By.xpath("//a[@href=\"/users/3\"]//parent::div//parent::div//child::img"));
		  Actions act = new Actions(driver);
	        act.moveToElement(users1).perform();
	        String users1String= driver.findElement(By.xpath("//a[@href=\"/users/1\"]")).getText();
	        Assert.assertEquals(users1String, "View profile");
	       
	        
	        act.moveToElement(users2).perform();
	        String users2String= driver.findElement(By.xpath("//a[@href=\"/users/2\"]")).getText();
	        Assert.assertEquals(users2String, "View profile");
	        
	        act.moveToElement(users3).perform();
	        String users3String= driver.findElement(By.xpath("//a[@href=\"/users/3\"]")).getText();
	        Assert.assertEquals(users3String, "View profile");
	        
		  
	  }
	  @BeforeMethod
	  public void launchBrowser() {
		  
			 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	 
			
		  driver= new ChromeDriver();
		
		  driver.get("https://the-internet.herokuapp.com/");
		   driver.manage().window().maximize();


	}

	  @AfterMethod
	 public void closeBrowser() {
		  
		  driver.close();
	  }




}
