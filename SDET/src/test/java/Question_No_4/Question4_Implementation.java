package Question_No_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4_Implementation {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
    driver=new ChromeDriver();  
      
    driver.navigate().to("http://www.automationanywhere.com/");  
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    
    String[] xpaths_list= {"//a[text()='Products']","//a[text()='Solutions']","//a[text()='Solutions']","//a[text()='Beyond RPA']","//a[text()='Company']","//a[text()='Resources']"};
    
    for(String xpath: xpaths_list)
    {
    	WebElement ele=driver.findElement(By.xpath(xpath));
    	ele.click();
    	String url=driver.getCurrentUrl();
    	if(xpath.contains("Products")&& url.contains("products"))
    	{
    		System.out.println("Products tab is verified and present on homepage");
    	}
    	if(xpath.contains("Solutions")&& url.contains("solutions"))
    	{
    		System.out.println("Solutions tab is verified and present on homepage");

    	}
    	if(xpath.contains("Beyond RPA")&& url.contains("rpa"))
    	{
    		System.out.println("Beyond RPA link is verified and present on homepage");

    	}
    	if(xpath.contains("Company")&& url.contains("company"))
    	{
    		System.out.println("Company tab is verified and present on homepage");

    		
    	}
    	if(xpath.contains("Resources")&& url.contains("resources"))
    	{
    		System.out.println("Resources tab is verified and present on homepage");

    	}
    }
	  
	  
}
}
