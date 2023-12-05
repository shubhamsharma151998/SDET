package question_No_5;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Question4_TestNGAnswerWithTimeOut {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
	    driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("http://www.automationanywhere.com/");  
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	}
	
  @Test(priority=1,timeOut=5000)
  public void verifyPrdoucts() {
	  Actions actions =new Actions(driver);
	  WebElement menuOption=driver.findElement(By.xpath("//a[text()=\"Products\"]"));
	  actions.moveToElement(menuOption).perform();
	  driver.findElement(By.xpath("//a[text()=\"Products\"]")).click();
	  String url=driver.getCurrentUrl();
	  if(url.contains("products"))
	  {
		  System.out.println("Verified that Product tab is present on homepage");
	  }
	  driver.navigate().back();
   }
  @Test(priority=2)
  public void verifySolutions() {
	  Actions actions =new Actions(driver);
	  WebElement menuOption=driver.findElement(By.xpath("//a[text()=\"Solutions\"]"));
	  actions.moveToElement(menuOption).perform();
	  driver.findElement(By.xpath("//a[text()=\"Solutions\"]")).click();
	  String url=driver.getCurrentUrl();
	  if(url.contains("solutions"))
	  {
		  System.out.println("Verified that Solutions tab is present on homepage");
	  }
	  driver.navigate().back();
   }
  @Test(priority=3)
  public void verifyResources() {
	  
	  Actions actions =new Actions(driver);
	  WebElement menuOption=driver.findElement(By.xpath("//a[text()=\"Resources\"]"));
	  actions.moveToElement(menuOption).perform();
	  driver.findElement(By.xpath("//a[text()=\"Resources\"]")).click();
	  String url=driver.getCurrentUrl();
	  if(url.contains("resources"))
	  {
		  System.out.println("Verified that Resources tab is present on homepage");
	  }
	  driver.navigate().back();
   }
  @Test(priority=4)
  public void verifyBeyonRPA()
  {
	  JavascriptExecutor js = (JavascriptExecutor) driver;		
      WebElement Element = driver.findElement(By.xpath("//a[text()=\"Beyond RPA\"]"));      
      js.executeScript("arguments[0].scrollIntoView();", Element);
      driver.findElement(By.xpath("//a[text()=\"Beyond RPA\"]")).click();
      String url=driver.getCurrentUrl();
	  if(url.contains("rpa"))
	  {
		  System.out.println("Verified that Beyond RPA link is present on homepage");
	  }
	  driver.navigate().back();
  }
  
  @Test(priority=5)
public void verifyCompany() {
	  
	  Actions actions =new Actions(driver);
	  WebElement menuOption=driver.findElement(By.xpath("//a[text()=\"Company\"]"));
	  actions.moveToElement(menuOption).perform();
	  driver.findElement(By.xpath("//a[text()=\"Company\"]")).click();
	  String url=driver.getCurrentUrl();
	  if(url.contains("company"))
	  {
		  System.out.println("Verified that Company tab is present on homepage");
	  }
	  driver.navigate().back();
   }
  @AfterTest
	public void tear()
	{
	  //driver.quit();
	}
}
