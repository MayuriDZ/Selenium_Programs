package autosuggestionPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SelectOptionProgram 
{
           public static void main(String[] args)
           {
        	   String expText = "iphone 15 pro";
        	     System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver-win64\\chromedriver.exe");
                 WebDriver driver = new ChromeDriver();
                 driver.get("https://www.google.com/");
                 driver.manage().window().maximize();
                 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                 
              // Find the search input
                 driver.findElement(By.xpath("//textarea[contains(@title, 'Search')]")).sendKeys("iphone 15 pro");
               //identify autosuggestion xpath by using absolute/relative xpath
                 //To get size of autosuggestion present
                 List<WebElement>  allOptions    =  driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
                  System.out.println("Get All Options - "+ allOptions.size());
                  
                  for(WebElement options : allOptions)
                  {
                	  String actText = options.getText();
                	  System.out.println(actText);
                	  if(actText.equals(expText))
                	  {
                		  options.click();
                		  
                	  }
                  }
               // Close the browser
                  driver.close();
           
           }
}
