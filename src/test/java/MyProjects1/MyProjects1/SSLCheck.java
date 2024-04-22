package MyProjects1.MyProjects1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) throws IOException {
		// Handling the behavior browser certification
		
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dist=new File("E:\\expired.png");
        FileUtils.copyFile(src, dist);
		
	}

}
