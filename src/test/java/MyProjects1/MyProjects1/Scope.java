package MyProjects1.MyProjects1;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class Scope {

	public static void main(String[] args) 
	{
		// count the link on webpage
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 
		 //how to creat the subdrive /mini driver
		 
		 WebElement footerdiver= driver.findElement(By.id("gf-BIG"));
		 System.out.println(footerdiver.findElements(By.tagName("a")).size());
		 
		 // minidriver to coloumdriver1
		 
		 WebElement coloumdriver1=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		 System.out.println(coloumdriver1.findElements(By.tagName("a")).size());
		 
		 //Check the link are working on coloumdriver1
		 
		 for(int i=1;i<coloumdriver1.findElements(By.tagName("a")).size();i++)
		 {
             String clicklinktab= Keys.chord(Keys.CONTROL,Keys.ENTER); //select the control and hits enter nd open the link in new tab
             
			 coloumdriver1.findElements(By.tagName("a")).get(i).sendKeys(clicklinktab);
		 }	
		    //switch window and getTitle of windows
			 Set<String> tabs=driver.getWindowHandles();
			 java.util.Iterator<String> it =tabs.iterator();
			 
			 while(it.hasNext())
			 {
				 driver.switchTo().window(it.next());
				 System.out.println(driver.getTitle());
			 }
		 
		 
		 

	}

}
