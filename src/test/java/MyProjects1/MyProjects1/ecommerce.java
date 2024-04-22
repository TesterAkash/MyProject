package MyProjects1.MyProjects1;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// How to add item in Addcart

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] vegName = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot", "Carrot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(4000);
		addItem(driver, vegName);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
	  
       
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

	public static void addItem(WebDriver driver, String[] vegName) {
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;
		for (int i = 0; i < product.size(); i++) {

			// Format it to get actual veg name
			String[] name = product.get(i).getText().split("-");
			// Brocoli - 1kg splited

			String fromatedName = name[0].trim();

			// convert array vegname into ArrayList
			List itemName = Arrays.asList(fromatedName);

			// click the item present in vegname

			if (itemName.contains(fromatedName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if (j == vegName.length) {
				break;
			}

		}

		
	}

}
