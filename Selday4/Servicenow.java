package week3.Selday4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Servicenow {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver.get(" https://dev67829.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Di!1K0cpR-hW");
		driver.findElement(By.id("sysverb_login")).click();

		
		
		
		
	}

}
