package MyProjects1.MyProjects1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class Action {

	public static void main(String[] args) 
	{
		// Mouse Over
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions mouse=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		 
		mouse.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).build().perform();
		mouse.moveToElement(driver.findElement(By.xpath("//a[text()='New Releases']"))).contextClick().build().perform();	
		
		

	}

}
