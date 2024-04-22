package MyProjects1.MyProjects1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
		    i++;
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}*/
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//span[text()='+']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[@id=\"hrefIncChd\"][1]")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[@id=\"hrefIncInf\"][1]")).click();
		}
		
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
