package q2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) {
		// For Chrome Browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		// For fire fox browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		
		String expectedTitle = "STORE";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("You Landed On Correct Page");
		}
		else {
			System.out.println("You Landed on Incorrect page");
		}
		
		driver.quit();
	}

}
