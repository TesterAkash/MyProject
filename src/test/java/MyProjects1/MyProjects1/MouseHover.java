package MyProjects1.MyProjects1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     WebDriverManager.edgedriver().setup();
     WebDriver driver=new EdgeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://rahulshettyacademy.com/");
     //mouse hover dropdown
     WebElement hover=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
      Actions m=new Actions(driver);
      m.moveToElement(hover).perform();
      driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//nav[@class='main-menu']//div[@class='navbar-collapse collapse clearfix']//ul[@class='navigation clearfix']//li[@class='dropdown']//ul[@class='dropdown-menu']//li//a[@href='part-time-jobs'][normalize-space()='Part time jobs']")).click();
      driver.close();
	
      
	
	}

}
