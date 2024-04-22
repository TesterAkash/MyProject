package MyProjects1.MyProjects1;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions options = new ChromeOptions();
		String downloadPath = System.getProperty("E:\\eclipse-workspace\\MyProjects1");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		options.setExperimentalOption("prefs",chromePrefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("ZIP file")).click();
		
		Thread.sleep(5000);
		
		String filePathUpdated = downloadPath+"\\DownloadDemo-master.zip";
		
		File file = new File(filePathUpdated);
		
		Assert.assertTrue(file.exists());
		
		if(file.exists()) {
			
			System.out.println("file got download");
			
		}else
		{
			System.out.println("file not found");
		}
	}

}
