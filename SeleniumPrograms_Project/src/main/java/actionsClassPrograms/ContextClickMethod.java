package actionsClassPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod 
{
         public static void main(String[] args)
         {
        	// Set the path to the ChromeDriver executable
             System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");

             // Create a new instance of the ChromeDriver
             WebDriver driver = new ChromeDriver();
              
            // Maximize the browser window to ensure that the web page is fully visible
     	    driver.manage().window().maximize();
             
             // Navigate to a web page
             driver.get("https://www.flipkart.com/");
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
             
             driver.findElement(By.xpath("//button[text()='✕']")).click();
             
             WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
             
             Actions act = new Actions(driver);
             // moveToElement method
             act.moveToElement(login).perform();
             
             
             // context click
             WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
             act.contextClick(more).build().perform();
             System.out.println("perform context click");
         }
}
