package week2.selday2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ButtonTestGround {

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/button.xhtml");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//span[text()='Click']")).click();
			String title = driver.getTitle();
			System.out.println("Current Title: " + title);
			driver.navigate().back();
			
			WebElement Text=driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/parent::div"));
		    boolean isbuttondisabled=Text.isEnabled();
		    if(isbuttondisabled)
		    {
		    	System.out.println("The button is disabled");
		    }
		    else {
		    	System.out.println("Button is not disabled");
		    }
		    
		    
		    
		    WebElement Text1=driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		    System.out.println(Text1.getLocation());
		    
		    
		    System.out.println("Save Button Colour: " + driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color"));
		    
		    int height = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getHeight();
			int width = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getWidth();
			
			System.out.println("Height " + height);
			System.out.println("Width " + width);
		    
			String text3=driver.findElement(By.name("j_idt88:j_idt100")).getCssValue("background-color");
			String text4=driver.findElement(By.xpath("//span[text()='Success']")).getCssValue("background-color");
			if(text3.equalsIgnoreCase(text4))
					{
				System.out.println("The color is not changed");
			}
			else
			{
				System.out.println("The color is changed");
			}
			
			driver.findElement(By.xpath("//span[text()='Image']")).click();
			driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']/parent::div")).click();
			
			// To check how many buttons are there
			
			driver.close();
			
			
			
		    
		}
	}
	