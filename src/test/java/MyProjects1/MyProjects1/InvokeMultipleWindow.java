package MyProjects1.MyProjects1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindow {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	    driver.switchTo().newWindow(WindowType.TAB);//open new tab
		
		Set<String>handle=driver.getWindowHandles();
        Iterator<String>	it	=handle.iterator();
		String Parentwindow= it.next();
		String ChildeWindow= it.next();
		
		driver.switchTo().window(ChildeWindow);
		driver.get("https://rahulshettyacademy.com/");
		
		//getText
		String coursename=driver.findElement(By.xpath("//a[text()='Core java for Automation Testers + Interview Programs']")).getText();
		
		//Paste in Parentwindow
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(coursename);
		
		//Window
		 
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String>ab = handles.iterator();
		
		
		String Pwindow=ab.next();
		String Cwindow=ab.next();
		
		driver.switchTo().window(Cwindow);
		driver.get("https://rahulshettyacademy.com/");
		String cName=driver.findElement(By.xpath("//a[text()='Learn Postman for API Automation Testing with Javascript']")).getText();
		
		driver.switchTo().window(Pwindow);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(cName);
		
		
	}

}
