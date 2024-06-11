package q3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) {
		// For Chrome Browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		// For fire fox browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		
	   driver.findElement(By.xpath("//div[@class='vector-toc-text']/span[text()='History']")).click();
	 
		String title = driver.findElement(By.xpath("//div[@role='note']//a[@title='History of artificial intelligence']")).getText();
		
			System.out.println(title);
		
		driver.quit();
	}

	}


