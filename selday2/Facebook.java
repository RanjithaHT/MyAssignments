package week2.selday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Ranjitha");
        driver.findElement(By.name("lastname")).sendKeys("T");
        driver.findElement(By.name("reg_email__")).sendKeys("8050757728");
        driver.findElement(By.id("password_step_input")).sendKeys("Ranju@11");
        
        WebElement dropDown=driver.findElement(By.id("day"));
        Select source=new Select(dropDown);
        source.selectByIndex(10);
        
        WebElement dropDown1=driver.findElement(By.id("month"));
        Select source1=new Select(dropDown1);
        source1.selectByValue("5");
        
        WebElement dropDown2=driver.findElement(By.id("year"));
        Select source2=new Select(dropDown2);
        source2.selectByVisibleText("1994");
        
        driver.findElement(By.className("_58mt")).click();
        
        String title = driver.getTitle();
        
        System.out.println(title);
        
        
        
	}

}
