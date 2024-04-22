package MyProjects1.MyProjects1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {
	

	public static void main(String[] args) throws InterruptedException 
	{
		String name="AKASH";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
        Thread.sleep(20);
        driver.findElement(By.className("submit")).click();
        
        /* Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector("#root > div > div > div > h2")).getText());
        Thread.sleep(5000);
        Assert.assertEquals((driver.findElement(By.cssSelector("#root > div > div > div > h2")).getText()), "Hello"+name+",");
        */
        
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Thread.sleep(5000);
        Assert.assertEquals((driver.findElement(By.tagName("p")).getText()), "You are successfully logged in.");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();


	}
	
}
