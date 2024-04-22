package MyProjects1.MyProjects1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
       // capture full screen shot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File distscr=new File("E:\\screenshot.png");
        FileUtils.copyFile(src, distscr); 
        
        //capture the Specific WebElement
          
        WebElement name=driver.findElement(By.xpath("//a[text()='Home']"));
        File filename=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filename, new File("name.png"));
	}

}
