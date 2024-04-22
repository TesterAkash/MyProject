package MyProjects1.MyProjects1;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		 driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		 
		 Set<String>window=driver.getWindowHandles(); //Parent to child
		 Iterator<String> it=window.iterator(); 
		 String ParentID=it.next(); String
		 ChildID=it.next(); 
		 driver.switchTo().window(ChildID);
		 System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		  
		 
		 String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split(
		 "at")[1].trim().split(" ")[0]; System.out.println(emailId);
		 driver.switchTo().window(ParentID);
		 driver.findElement(By.id("username")).sendKeys(emailId);
		 emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split(
		 "at")[1].trim().split(" ")[0];
		 System.out.println(emailId);
		 

		/*
		// assignment
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parantID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.xpath("(//div[@class='example'])/h3")).getText());
        driver.switchTo().window(parantID);
        System.out.println(driver.findElement(By.xpath("(//div[@class='example'])/h3")).getText());
      
        */
	}

}
