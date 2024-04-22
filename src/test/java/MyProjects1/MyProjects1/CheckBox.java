package MyProjects1.MyProjects1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		// Check box
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected()); //testng
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());//checking checkbox
		
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click(); //select checkbox
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected()); //testng
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		//count the check box
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		

	}

}
