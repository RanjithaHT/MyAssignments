package week2.selday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
        
        driver.findElement(By.id("firstNameField")).sendKeys("Ranjitha");
        driver.findElement(By.id("lastNameField")).sendKeys("HT"); 
        
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ranju");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Hassan"); 
        
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computers"); 
        
        driver.findElement(By.id("createContactForm_description")).sendKeys("This is Ranjitha H T,Software Tester");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ranjuhassan@gmail.com"); 
        
        WebElement dropDown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select source=new Select(dropDown);
        source.selectByVisibleText("Alabama");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        driver.findElement(By.xpath("//a[text()='Edit']")).click(); 
        
        driver.findElement(By.id("updateContactForm_description")).clear();
        
        driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is important note");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        String title = driver.getTitle();
        
        System.out.println(title);
        
        
       
        
        
        

	}

}
