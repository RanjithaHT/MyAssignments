package week2.selday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acme {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
        driver.findElement(By.id("password")).sendKeys("leaf@12");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        
        
        String title = driver.getTitle();
        System.out.println(title);
        
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
        
        driver.close();

	}

}
