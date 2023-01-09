package week2.selday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleaf {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ranjitha");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HT"); 
        
        WebElement dropDown=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select source=new Select(dropDown);
        source.selectByIndex(3);
        
        WebElement dropDown1=driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select source1=new Select(dropDown1);
        source1.selectByValue("IND_INSURANCE");
        
        WebElement dropDown2=driver.findElement(By.id("createLeadForm_currencyUomId"));
        Select source2=new Select(dropDown2);
        source2.selectByVisibleText("AUD - Australian Dollar");
        
        driver.findElement(By.name("submitButton")).click();
        
        String title = driver.getTitle();
        
        System.out.println(title);

	}

}
