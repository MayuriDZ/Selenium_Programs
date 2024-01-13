package actionsClassPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndMoveToElementMethods 
{
       public static void main(String[] args)
       {
    	    // Set the system property to specify the location of the ChromeDriver executable file
    	    System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
    	    
    	    // Initialize a new instance of the ChromeDriver to automate the Chrome browse
    	    WebDriver driver = new ChromeDriver();
    	   
    	    // Maximize the browser window to ensure that the web page is fully visible
    	    driver.manage().window().maximize();
    	    
    	    // Navigate to the specified URL
    	    driver.get("https://www.amazon.com/");
    	    
    	    //Find the web element representing the login button and click on it
    	    WebElement login = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
            System.out.println("click on login");
         
            // Create an instance of the Actions class to perform mouse actions
    	    Actions act = new Actions(driver);
    	    
    	 // Move the mouse pointer to the login button
    	    act.moveToElement(login).perform();
    	    System.out.println("Move to login");
    	    
    	 // Find the web element representing the 'Music Library' link and click on it
    	    WebElement account = driver.findElement(By.xpath("//span[text()='Music Library']"));
    	    System.out.println("click on music library.");
    	    
    	 // Perform a click action on the 'Music Library' link
            act.click(account).build().perform();
            System.out.println("End of program.");
            
            //close the browser
            driver.close();
       }
}
