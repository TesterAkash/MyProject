package MyProjects1.MyProjects1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2Demo {

	public static void main(String[] args) throws InterruptedException
	{
		//Parse the String with JAVA method to get the password dynamically from the page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String pass=getpassword(driver); //calling the below method.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("inputUsername")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		Thread.sleep(5000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		
		 Thread.sleep(5000);
	        System.out.println(driver.findElement(By.tagName("p")).getText());
	        Thread.sleep(5000);
	        Assert.assertEquals((driver.findElement(By.tagName("p")).getText()), "You are successfully logged in.");
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	        Thread.sleep(2000);
	        driver.close();
		
        
		
	}

	public static String getpassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Reset Login']")).click();
		Thread.sleep(5000);
	    String passwordText= driver.findElement(By.cssSelector("form p")).getText();
	    System.out.println(passwordText);
	    //Please use temporary password 'rahulshettyacademy' to Login.
	    String[]passwordarray=passwordText.split("'");
	    passwordarray[1].split("'");
	    //0th index Please use temporary password
	    //1th rahulshettyacademy' to Login
	    String Password=passwordarray[1].split("'")[0];
	    return Password;
	   	
	    //0th index rahulshettyacademy
	    //1th index  to Login
	    
	    
	    
	    
	  
	    
		
	}
	
}
