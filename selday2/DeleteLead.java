package week2.selday2;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

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
        
        driver.findElement(By.xpath("//span[text()='Phone']")).click();

        driver.findElement(By.name("phoneNumber")).sendKeys("12");
        
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
        
        driver.findElement(By.className("subMenuButtonDangerous")).click();  
        
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        
        driver.findElement(By.name("id")).sendKeys("10519"); 
        
        driver.findElement(By.className("x-btn-text")).click();    
        
        String text= driver.findElement(By.className("x-paging-info")).getText();
        
        if(text.equalsIgnoreCase("No records to display"));
        {
        	System.out.println("Lead Delected succussfully");
        }
        
        driver.quit();
	}

}
