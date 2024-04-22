package MyProjects1.MyProjects1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) throws InterruptedException 
	{
		// Radio button
        

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(2000);
		
		//month travers parent xpat to child xpath 
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		while(!driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']")).getText().contains("December"))
		{
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //a[@title='Next']")).click();
		}
		Thread.sleep(2000);
		
		//date select the xpath of anydate 
		List<WebElement> dates=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		int count=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
			if(text.equalsIgnoreCase("2"))
			{
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				break;
			}
		}
		
		
		
	}

}
