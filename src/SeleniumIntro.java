import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumIntro {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String URL= "https://www.belazu.com/";
	

	
	//Open URL and maximise the window
	//
	driver.get("https://www.belazu.com/");
	driver.manage().window().maximize();
	
	//Click on Sign in
	
	
	
	//Login
	
	
	//
	
	  String ProductName=driver.findElement(By.xpath("//*[@id=\"renderPage\"]/header/div/div/div[2]/header/div/div[2]/div/div[1]/div/div[1]/form/input")).getText();
	  System.out.println(ProductName);
	  driver.findElement(By.name("q")).sendKeys(ProductName);
	  driver.findElement(By.className("ms-search__form-control")).click();
      
	  WebElement ThirdImg=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div"));
	  Actions actions=new Actions(driver);
	  actions.moveToElement(ThirdImg).click().perform();
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div[2]/div[3]/ul/li[3]/div/div[2]/div[3]/div[2]/button")).click();

	

	  
	 
	driver.findElement(By.className("ms-search__form-control")).clear();
	driver.findElement(By.className("ms-search__form-control")).sendKeys("pasta");
	driver.findElement(By.className("ms-search__form-control")).sendKeys(Keys.ENTER);

	driver.findElement(By.className("msc-product__title product-title jc-upperHeading-md"));
	driver.findElement(By.className("product-addToBasket")).click();
	driver.findElement(By.className("minicart-container-shop")).click();
	
	
	
	
	

	
	
	}


		
	
	

}
	