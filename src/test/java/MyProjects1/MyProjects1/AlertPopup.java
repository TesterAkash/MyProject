package MyProjects1.MyProjects1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		//Alert and Popup on window
		String name="AKASH";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
         driver.findElement(By.id("name")).click();
         driver.findElement(By.id("name")).sendKeys(name);
         driver.findElement(By.id("alertbtn")).click();
         Thread.sleep(2000);
         String gettext=driver.switchTo().alert().getText();
         System.out.println(gettext);
         
         driver.switchTo().alert().accept();
         Thread.sleep(2000);
         driver.findElement(By.id("confirmbtn")).click();
         System.out.println(driver.switchTo().alert().getText());
         
         driver.switchTo().alert().dismiss();
         
         
	}

}
