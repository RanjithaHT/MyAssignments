package week3.Selday4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Buythevalue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on first product (eg: Hamdard Hing - 50GM)Handle Frame
		
		driver.findElement(By.xpath("//a[@class='grid-image']")).click();
		driver.findElement(By.id("com-hextom-smartpushmarketing-modal-close-modal")).click();
		//Enter the pincode 
		driver.findElement(By.id("wk_zipcode")).sendKeys("560040");
		
		//Close chat widget
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//button[@class='InitialMessageBubble__CloseButton-sc-1sz7s3c-2 fVrRGD']")).click();
		driver.switchTo().defaultContent();
		
		//Click on Check
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		
		// Click on ADD TO CART
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		
		
		
		// Click on View
		
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click(); 
		
		// Click on CHECK OUT
		driver.findElement(By.id("checkout")).click();
		
		//Handle alert
		//Accept the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
		

	}

}
