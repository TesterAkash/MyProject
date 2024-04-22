package MyProjects1.MyProjects1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException
	{
		// above
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namefield = driver.findElement(By.xpath("//input[@name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(namefield)).getText());
		
       //below
		WebElement Emaillable=driver.findElement(By.xpath("//label[text()='Email']"));
	    driver.findElement(with(By.xpath("//input[@name='email']")).below(Emaillable)).sendKeys("name@gmail.com");
	    
	    //Left of checkbox/employee
	   
	    Thread.sleep(2000);
	    WebElement checkBox=driver.findElement(By.xpath("//label[text()='Employed']"));
	    System.out.println(checkBox.getText());
	    driver.findElement(with(By.tagName("input")).toLeftOf(checkBox)).click();
	    
	    //right of checkbox/student  
	     WebElement checkbox=driver.findElement(By.xpath("//input[@value='option1']"));
	     
	     System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(checkbox)).getText());
	    
	    
	    
	}
	

}
