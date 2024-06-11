package q1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowserLaunch {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
		driver.navigate().refresh();

		driver.quit();
	}
}
