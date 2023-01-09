package week2.selday2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Inputtestground {
		
		@SuppressWarnings("unlikely-arg-type")
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/input.xhtml");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[1]")).sendKeys("Ranjitha");
			driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).sendKeys("Bangalore");
			
			boolean Button = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']/..")).isEnabled();
			if (Button) {
				System.out.println("The button is disabled");
			
			} else {
				System.out.println("The button is disabled");
			}
			
			driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[4]")).clear();
			
			
			String text = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input")).getText();
			System.out.println(text);
			
			WebElement mail = driver.findElement(By.xpath("(//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input)[1]"));
			mail.sendKeys("ranjithaht@gmail.com");
			mail.sendKeys(Keys.TAB);
			
			if(mail.equals("Type about yourself"))
			{
				System.out.println("Cursor is not moved to next line");
	
			}
			else
			{
				System.out.println("Cursor is moved to next line");
			}
		    
			
			driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::textarea")).sendKeys("My name is Ranjitha, I am from Hassan, I have 3.3years experiance.");
			
			driver.findElement(By.xpath("//div[contains(@class,'col-12 mb-2')]//input[1]")).sendKeys(Keys.RETURN);
			
			WebElement Text=driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
			System.out.println("The error message is :" +Text.getText());
			
			WebElement Text1=driver.findElement(By.xpath("//span[@class='ui-float-label']//input[1]"));
			System.out.println("The label position is :" +Text1.getLocation());
			
			driver.findElement(By.xpath("//label[text()='Username']/following::input")).sendKeys("Ranjitha");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li)[3]")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//label[text()='Username']/following::input)[2]")).sendKeys("05/11/1994");
			
			
			driver.findElement(By.xpath("(//label[text()='Username']/following::input)[3]")).click();
			
			WebElement val=driver.findElement(By.xpath("//input[contains(@class,'ui-spinner-input ui-inputfield ui-state-default ui-corner-all')]"));
			val.sendKeys("11");
			
			WebElement val1= driver.findElement(By.xpath("//span[@class='ui-button-text']//span"));
			val1.click();
			
			if(val1.equals(val)) {
				System.out.println("Value is not changes");
			}
			else
			{
				System.out.println("The value is changed");
			}
			
			WebElement val3=driver.findElement(By.xpath("//input[@id='j_idt106:slider']"));
			val3.sendKeys("10");
			
			WebElement val4=driver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']/span"));
			
			if(val3.equals(val4)) {
				System.out.println("slider is not moved");
			}
			else
			{
				System.out.println("slider is moved");
			}
			
			
			WebElement val5=driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']"));
			val5.sendKeys(Keys.RETURN);
			
			boolean isVisible=val5.isDisplayed();
			
			if(isVisible){
				System.out.println("the keybroad is displayed");
			}
			driver.quit();
			
			
		
		}
		
		
		
}
