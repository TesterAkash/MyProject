package MyProjects1.MyProjects1;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionAJAX {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// AJAX
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5000);
		driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN,Keys.ENTER);
		System.out.println(driver.findElement(By.id("autosuggest")).getAttribute("value"));
		/*
		//xpath is capture all web element so i use the parent to child 
	     List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        
	    for(WebElement option:options)
	    {
	      if(option.getText().equalsIgnoreCase("India"))
	      {
	    	  option.click();
	    	  break;
	      }
	    }*/
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist=new File("E:\\rahulshettyacademy.png");
		FileUtils.copyFile(scr, dist);
		
	}

}
