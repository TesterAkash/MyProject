package MyProjects1.MyProjects1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class JavascriptExecutorDemo {

	public static void main(String[] args) 
	{
		// How to handle scrolling 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//window scroll
        js.executeScript("window.scrollBy(0,500)");
        
        //under the window there is table 
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
        //sum the total value and compair
		List<WebElement> value=driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int Sum=0;
		
		for(int i=0; i<value.size();i++)
		{
			Sum=Sum + Integer.parseInt(value.get(i).getText()); 
			
		}
		System.out.println(Sum);
        
		String s= driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		 int Total= Integer.parseInt(s.split(":")[1].trim());
		 Assert.assertEquals(Sum, Total);
		 
		 List<WebElement> val=driver.findElements(By.xpath("//table[@class='table-display'] //td[3]"));
		 
		 int i=0;
		 for(int j=0; j<val.size();j++)
		 {
			 
			 
			 System.out.println(val.get(j).getText());
			  i=i+ Integer.parseInt(val.get(j).getText());
			 
			 
		 }
		 System.out.println(i);
		 
		 
		 //count the rows and coloums of table
		 
		 WebElement table= driver.findElement(By.id("product"));
		 //count the row nd coloum
		 System.out.println(table.findElements(By.tagName("tr")).size());
		 System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		 
		 List<WebElement>secondrow=driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		 System.out.println(secondrow.get(0));
		 System.out.println(secondrow.get(1));
		 System.out.println(secondrow.get(2));
		 
		 
	
	}

}
