package MyProjects1.MyProjects1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementScreenShot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	   
		 
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String>ab = handles.iterator();
		
		
		String Pwindow=ab.next();
		String Cwindow=ab.next();
		
		driver.switchTo().window(Cwindow);
		driver.get("https://rahulshettyacademy.com/");
		String cName=driver.findElement(By.xpath("//a[text()='Learn Postman for API Automation Testing with Javascript']")).getText();
		
		driver.switchTo().window(Pwindow);
		WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(cName);
		
		File filename=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filename, new File("name.png"));
		
		

	}

}
