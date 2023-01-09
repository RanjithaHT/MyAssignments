package week2.selday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
           
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
      
        driver.findElement(By.xpath("//span[text()='Email']")).click();
        
        driver.findElement(By.name("emailAddress")).sendKeys("Test@testleaf.com");
        
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
        
        driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
        
        String title = driver.getTitle();
        
        if(title.equalsIgnoreCase("Duplicate Lead"));
        {
        	System.out.println("Title is Duplicate Lead");
        }
        
        driver.findElement(By.className("smallSubmit")).click();
        
        String text= driver.findElement(By.className("requiredField")).getText();
        
        if(text.equalsIgnoreCase("10396"));
        {
        	System.out.println("Duplicated lead name is same as captured name");
        }
       
        driver.quit(); 
	}

}
