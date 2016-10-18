package FirstPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestFacebookRegisteration 

{
	public static void main (String [] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sumit.causeway@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Sumit");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("Sahay");
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();
		Thread.sleep(3000);
		
		// for selecting in dropdown we use select method for that we need to create an object
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel1.selectByIndex(0);
		Thread.sleep(3000);
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel2.selectByVisibleText("Feb");
		Thread.sleep(3000);
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("2013");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
		Thread.sleep(3000);
		// clicking on link
		
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		Thread.sleep(3000);
		//driver.navigate().back();
		//driver.quit();
		
	}

}
