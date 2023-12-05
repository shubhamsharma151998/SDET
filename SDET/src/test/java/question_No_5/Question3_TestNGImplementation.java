package question_No_5;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Question3_TestNGImplementation {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		// Launch website
		driver.navigate().to("http://www.automationanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	}

	@Test
	public void verifyLogoButtonAndDemoButton() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("(//img[@class=\"coh-image coh-image-responsive-xl\"])[1]"));
		if (ele.isDisplayed()) {
			System.out.println("Logo is Present");
		}
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath(
				"//a[@class=\"coh-link coh-style-solid-orange-button btn-link\" and contains(@title,\"Request demo\")]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//a[@class=\"coh-link utility-nav-link coh-style-solid-orange-button\"]"))
				.isEnabled()) {
			System.out.println("Request Demo Button is clickable");
			driver.findElement(By.xpath("//a[@class=\"coh-link utility-nav-link coh-style-solid-orange-button\"]"))
					.click();
		}
	}
}
