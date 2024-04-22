package MyProjects1.MyProjects1;
 import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		// Locator
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
		driver.findElement(By.id("inputUsername")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("NoPssword");
		Thread.sleep(5000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("#container > div.form-container.sign-in-container > form > p")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("akash");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("za@gmail");
		driver.findElement(By.xpath("//*[@type='text'][3]")).click();
		driver.findElement(By.xpath("//*[@type='text'][3]")).sendKeys("354636383");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Reset Login']")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Go to Login']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("inputUsername")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(5000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		

	}

}
