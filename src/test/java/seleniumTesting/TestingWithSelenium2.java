package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingWithSelenium2 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	 public void entryAd() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[@href=\"/entry_ad\"]")).click();
		  driver.switchTo().activeElement();
		  WebElement state= driver.findElement(By.xpath("//div[@class=\"modal-footer\"]/p"));
		  
		  JavascriptExecutor javascript=(JavascriptExecutor)driver;
			javascript.executeScript("arguments[0].setAttribute('style', 'background: tomato; border: 5px solid red;');", state);
	//	  wait.until(ExpectedConditions.elementToBeClickable(state));
		Thread.sleep(3000);
			state.click();
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
