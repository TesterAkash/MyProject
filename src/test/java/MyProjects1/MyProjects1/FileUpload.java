package MyProjects1.MyProjects1;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		//file upload with the help of autoit
		WebElement chosefile=driver.findElement(By.id("file-upload"));
        Actions act=new Actions(driver);
        act.moveToElement(chosefile).click().perform();
        Runtime.getRuntime().exec("C:\\Users\\HP\\Documents\\FileUpload.exe");
       
		
		//file upload with help of send key and it apply when tagname as input and type="file"
       //driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input[1]")).sendKeys("C:\\Users\\HP\\Documents\\Set.txt");
	}
}
