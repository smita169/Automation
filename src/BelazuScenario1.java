import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BelazuScenario1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String URL= "https://www.belazu.com/";

		driver.get("https://www.belazu.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ms-search__form-control")).sendKeys("Pasta");
		driver.findElement(By.className("ms-search__form-control")).sendKeys(Keys.ENTER);
	    driver.findElement(By.cssSelector("a[aria-label*='Dried Penne']")).click();
	    driver.findElement(By.cssSelector("button.product-addButton")).click();
        driver.findElement(By.cssSelector("a[aria-label = 'View bag and checkout']")).click();
        driver.findElement(By.cssSelector("a[title='Guest Checkout']")).click();
        
        String expected = "Secure Checkout";
		String actual = driver.findElement(By.cssSelector("span.customHeaderContainer-title")).getText();
		
         
		
        	
	     
	}

}
