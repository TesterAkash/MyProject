package MyProjects1.MyProjects1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException
	{
		// Sibling - Child - Parent traverse
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String a=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(a);
		
		Thread.sleep(2000);
		
		String s=driver.findElement(By.xpath("//header/div/button[2]/following-sibling::button[1]")).getText();
		System.err.println(s);
		 
		//sibiling to Parent traverse
		
		String S =driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/div/button[1]")).getText();
		
		System.out.println(S);

	}

}
